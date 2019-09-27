package printqueue;

import java.text.DecimalFormat;

/**
 * The server class will allow the random classes into the fray so that the
 * project can work in a functional way
 *
 * @author Nomingerel Tserenjav and Muhammed Guroglu
 * @see java.text.DecimalFormat
 */
public class Server {

    private static char nextId = 'A';
    private char id;
    private double meanServiceRate;
    private double serviceRate;
    private int timeServiceEnds;
    private static Random randomMeanServiceRate = new Random(1.00, 0.20);
    private static Random randomServiceRate;
    private Client client;
    private boolean isFree;
    // Main constructor

    public Server() {
        id = (char) nextId++;
        meanServiceRate = randomMeanServiceRate.nextGaussian();
        randomServiceRate = new Random(meanServiceRate, 0.10);

    }

    /**
     * @return client
     */
    public Client getClient() {
        return client;
    }

    /**
     * Begins the serving of the queue
     *
     * @param client Client
     * @param time int
     */
    public void beginServing(Client client, int time) {
        this.client = client;
        serviceRate = randomServiceRate.nextGaussian();
        client.beginService(this, time);
        int serviceTime = (int) Math.ceil(client.getJobSize() / serviceRate);
        timeServiceEnds = serviceTime + time;

    }

    /**
     * Puts an end to the serving depending on finished queue
     *
     * @param time int
     */
    public void endServing(int time) {
        this.timeServiceEnds = time;
        client.endService(time);
        this.client = null;
    }

    /**
     * @return timeServiceEnds
     */
    public int getTimeServiceEnds() {
        return timeServiceEnds;
    }

    /**
     * Returns a client if the client is free
     *
     * @return client
     */
    public boolean isFree() {
        return client == null;
    }

    /**
     * Returns a string to be used in order for an organized data retriever
     *
     * @return id, meanServiceRate, and actualServiceRate
     */
    public String toString() {
        DecimalFormat format = new DecimalFormat("#,##0");
        return id + "(" + format.format(meanServiceRate * 100) + "%, "
                + format.format(serviceRate * 100) + "%)";
    }
}
