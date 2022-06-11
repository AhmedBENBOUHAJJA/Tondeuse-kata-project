package mower.domain.utils;

import mower.domain.beans.MowerCommand;
import org.apache.commons.lang.StringUtils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ConvertorCommandLine extends ConvertorLine<List<MowerCommand>> implements Serializable {

    private static final long serialVersionUID = 1L;

    public ConvertorCommandLine(final String line) {
        super(line);
    }

    @Override
    protected boolean isValidLine() {
        return StringUtils.isNotBlank(line)
                && StringUtils.containsOnly(line,
                MowerCommand.Avance.getCode()
                        + MowerCommand.Droite.getCode()
                        + MowerCommand.Gauche.getCode());
    }

    @Override
    protected List<MowerCommand> process() {
        List<MowerCommand> commands = new ArrayList<MowerCommand>();
        char [] listeCommands = line.toCharArray();

        for (char c : listeCommands) {
            commands.add(MowerCommand.getCommandeFromCode(String.valueOf(c)));
        }

        return commands;
    }
}
