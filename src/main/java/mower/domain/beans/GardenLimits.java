package mower.domain.beans;

import java.io.Serializable;

public class GardenLimits implements Serializable {

    private static final long serialVersionUID = 1L;

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
