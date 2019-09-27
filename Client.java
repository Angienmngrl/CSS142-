package printqueue;
/**
 * Description: Server check and makes sure the program runs with printers
 * @author Nomingerel Tserenjav and Muhammed Guroglu
 */
public class Client {

    // Declare public and private variables
    public static int MEAN_JOB_SIZE = 100;
    private static int nextId = 0;
    private int id;
    private int jobSize;
    private int tArrived;
    private int tBegan;
    private int tEnded;
    private Server server;
    private static Random randomJobSize = new Random(MEAN_JOB_SIZE);
 /**
     * Constructor for job arrived, job-size, and id
     * @param time int
     */
    public Client(int time) {
        id = ++nextId;
        jobSize = randomJobSize.intNextExponential();
        tArrived = time;
        PrintQueueSimulationGUI.displayText("Job# " + id + " has arrived at time "
                + tArrived + " with " + jobSize + " pages ");

        // print id time jobSize
    }

      /**
     * Get the job size 
     * @return jobSize
     */
    public double getJobSize() {
        return jobSize;
    }
  /**
     * Get the time arrived 
     * @return tArrived
     */
    public int getTimeArrived() {
        return this.tArrived;
    }
 /**
     * Get waiting time for the printer server
     * @return tBegan, tArrived
     */
    public int getWaitTime() {
        return tBegan - tArrived;
    }

     /**
     * Get service time of arrival between the ending of the service time
     * @return tEnded, tArrived
     */
    public int getServiceTime() {
        return tEnded - tBegan;
    }
 /**
     * Method for beginning the service
     * @param server Server
     * @param time int
     */
    public void beginService(Server server, int time) {
        this.server = server;
        PrintQueueSimulationGUI.displayText("Printer" + server + " began Job# " + this.id + " at time " + time);
        //System.out.println("Printer" + server + "began Job# " +this.id + " at time " + time);

    }
/**
     * Method for ending of the service
     * @param time int
     */
    public void endService(int time) {
        //System.out.println("Printer" + server + "ends Job# " + this.id + " at time " + time);
        PrintQueueSimulationGUI.displayText("Printer" + server + " ends Job# " + this.id + " at time " + time);
        server = null;
    }
     /**
     * Return a default job size and id
     * @return id, jobSize
     */

    public String toString() {
        return "#" + id + "(" + jobSize + ")";
    }
//    private void print (int job, int time, double size)
//    {
//        
//    }
//    private void printBegins(Server server, int job, int time)
//    {
//         this.tBegan = tBegan;
//         System.out.println("Printing of job# " + id +"("+ jobSize + ")" +
//                "has began on printer " + server + " at time " + time);
//    }
//    private void printEnds (Server server, int job, int time)
//    {
//        
//    }
}
