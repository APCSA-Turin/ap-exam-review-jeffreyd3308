public class SingleTable {

    // ADDED TO ENABLE TESTING; NOT IN ORIGINAL FRQ
    private int numSeats;
    private int height;
    private double viewQuality;

    // ADDED TO ENABLE TESTING; NOT IN ORIGINAL FRQ
    public SingleTable(int n, int h, double v) {
        numSeats = n;
        height = h;
        viewQuality = v;
    }

    public int getNumSeats() {
        return numSeats;
    }
    public int getHeight() {
        return height;
    }
    public double getViewQuality() {
        return viewQuality;
    }
    public void setViewQuality(double value) {
        viewQuality = value;
    }
}
