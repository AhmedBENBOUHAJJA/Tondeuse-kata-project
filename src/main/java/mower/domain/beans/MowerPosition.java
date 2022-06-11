package mower.domain.beans;

import java.io.Serializable;

public class MowerPosition implements Serializable {

    private static final long serialVersionUID = 1L;

    private int width;
    private int length;
    private MowerDirection direction;

    public MowerPosition(final int x, final int y, final MowerDirection direction) {
        this.width = x;
        this.length = y;
        this.direction = direction;
    }

    public void turnRightDirection() {
        direction = direction.getRightDirection();
    }

    public void turnLeftDirection() {
        direction = direction.getLeftDirection();
    }

    public void aheadIfPossible(final GardenLimits limit) {
        switch(direction) {
            case North :
                if (length < limit.getY()) { length += 1; }
                break;
            case South :
                if (length > 0) { length -= 1; }
                break;
            case East :
                if (width < limit.getX()) { width += 1; }
                break;
            case West :
                if (width > 0) { width -= 1; }
                break;
        }
    }

    public boolean isValidPosition(final GardenLimits limit) {
        return width >=0 && width <= limit.getX() && length >= 0 && length <= limit.getY();
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

    @Override
    public String toString() {
        return width + " " + length + " " + direction;
    }

    public MowerPosition clone() {
        return new MowerPosition(this.width, this.length, this.direction);
    }
}
