package mower.domain.beans;

public class MowerPosition {

    private int width;
    private int length;
    private MowerDirection direction;

    public MowerPosition(final int x, final int y, final MowerDirection direction) {
        this.width = x;
        this.length = y;
        this.direction = direction;
    }

    public void turnRightDirection() {

    }

    public void turnLeftDirection() {

    }

    public void aheadIfPossible(final GardenLimits limit) {

    }

    public boolean isValidPosition(final GardenLimits limit) {
        return false;
    }

    public int getX() {
        return width;
    }

    public int getY() {
        return length;
    }

    public MowerDirection getDirection() {
        return direction;
    }

    public MowerPosition clone() {
        return null;
    }
}
