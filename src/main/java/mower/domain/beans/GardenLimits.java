package mower.domain.beans;

public class GardenLimits {

    private final int width;
    private final int length;

    public GardenLimits(final int x ,final int y) {
        this.width = x;
        this.length = y;
    }

    public int getX() {
        return width;
    }

    public int getY() {
        return length;
    }
}
