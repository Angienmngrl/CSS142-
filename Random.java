package printqueue;
/**
 * Random class used for queueing the random interarrivals and printer
 * @author Nomingerel Tserenjav and Muhammed Guroglu
 */
public class Random extends java.util.Random {

    private double mean;
    private double standardDeviation;
 /**
     * Random overloaded constructor
     * @param mean double
     */
    public Random(double mean) {
        this.mean = mean;
        this.standardDeviation = 0.5 * mean;
    }

    /**
     * Random overloaded constructor
     * @param mean double
     * @param standardDeviation double
     */
    public Random(double mean, double standardDeviation) {
        this.mean = mean;
        this.standardDeviation = standardDeviation;
    }

    @Override
    /**
     * @return a double random number that is normally distributed with
     *
     * the given mean and standard deviation
     */
    public double nextGaussian() {
        double x = super.nextGaussian();  // x = normal(0.0, 1.0)
        return x * standardDeviation + mean;
    }
   /**
     * @return a double random number that is exponentially distributed
     *
     * with the given mean
     */
    public double nextExponential() {
        return -mean * Math.log(1.0 - nextDouble());
    }
 /**
     * Method: intNextExponential
     * @return nextExponential
     */
    public int intNextExponential() {
        return (int) Math.ceil(nextExponential());
    }

    public void setMean(int mean) {
        this.mean = mean;
    }
}
