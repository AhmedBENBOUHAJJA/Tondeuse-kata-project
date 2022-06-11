package mower.domain.utils;

import mower.domain.beans.MowerDirection;
import mower.domain.beans.MowerPosition;
import org.apache.commons.lang.StringUtils;

import java.io.Serializable;

public class ConvertorInitialPositionLine extends ConvertorLine<MowerPosition> implements Serializable {

    public ConvertorInitialPositionLine(final String line) {
        super(line);
    }

    @Override
    protected boolean isValidLine() {
        return StringUtils.isNotBlank(line) && line.matches("^[0-9] [0-9] (N|S|W|E)$");
    }

    @Override
    protected MowerPosition process() {
        String[] split = line.split(" ");
        MowerDirection direction = MowerDirection.getDirectionFromCode(split[2]);
        return new MowerPosition(Integer.valueOf(split[0]), Integer.valueOf(split[1]), direction);
    }
}
