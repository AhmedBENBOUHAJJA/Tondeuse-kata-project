package mower.domain.utils;

import mower.domain.beans.GardenLimits;

public class ConvertorGardenSizeLine extends ConvertorLine<GardenLimits>{

    public ConvertorGardenSizeLine(final String line) {
        super(line);
    }

    @Override
    protected boolean isValidLine() {
        return false;
    }

    @Override
    protected GardenLimits process() {
        return null;
    }
}
