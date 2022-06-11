package mower.domain.utils;

import mower.domain.beans.GardenLimits;
import org.apache.commons.lang.StringUtils;

import java.io.Serializable;

public class ConvertorGardenSizeLine extends ConvertorLine<GardenLimits> implements Serializable {

    private static final long serialVersionUID = 1L;

    public ConvertorGardenSizeLine(final String line) {
        super(line);
    }

    @Override
    protected boolean isValidLine() {
        return StringUtils.isNotBlank(line) && line.matches("^[0-9] [0-9]$");
    }

    @Override
    protected GardenLimits process() {
        String[] position = line.split(" ");
        return new GardenLimits(Integer.valueOf(position[0]), Integer.valueOf(position[1]));
    }
}
