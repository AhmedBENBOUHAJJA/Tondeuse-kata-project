package mower.domain.beans;

public enum MowerDirection {

    North("N", "W", "E"),
    South("S", "E", "W"),
    West("W", "S", "N"),
    East("E", "N", "S");

    private final String code;
    private final String left;
    private final String right;

    MowerDirection(final String code, final String leftCode, final String rightCode) {
        this.code = code;
        this.left = leftCode;
        this.right = rightCode;
    }

    public String getCode() {
        return this.code;
    }

    public MowerDirection getLeftDirection() {
        return getDirectionFromCode(left);
    }

    public MowerDirection getRightDirection() {
        return getDirectionFromCode(right);
    }

    public static MowerDirection getDirectionFromCode(final String code) {
        return null;
    }

    @Override
    public String toString() {
        return this.code;
    }
}
