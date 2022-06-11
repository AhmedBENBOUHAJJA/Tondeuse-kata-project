package mower.domain.utils;

import mower.domain.beans.MowerCommand;

import java.util.List;

public class ConvertorCommandLine extends ConvertorLine<List<MowerCommand>>{

    public ConvertorCommandLine(final String line) {
        super(line);
    }

    @Override
    protected boolean isValidLine() {
       return false;
    }

    @Override
    protected List<MowerCommand> process() {

        return null;
    }
}
