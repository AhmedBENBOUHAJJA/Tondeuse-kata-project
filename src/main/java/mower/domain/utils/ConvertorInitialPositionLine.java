package mower.domain.utils;

import mower.domain.beans.MowerPosition;

public class ConvertorInitialPositionLine extends ConvertorLine<MowerPosition> {

    public ConvertorInitialPositionLine(final String line) {
        super(line);
    }

    @Override
    protected boolean isValidLine() {
        return false;
    }

    @Override
    protected MowerPosition process() {
        return null;
    }
}
