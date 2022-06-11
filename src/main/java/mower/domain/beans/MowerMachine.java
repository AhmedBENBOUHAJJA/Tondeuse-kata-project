package mower.domain.beans;

import java.util.List;

public class MowerMachine {

    private final MowerPosition position;
    private final GardenLimits limite;
    private final List<MowerCommand> commands;

    public MowerMachine(final GardenLimits limit, final MowerPosition position, final List<MowerCommand> commands) {

        this.position = position;
        this.limite = limit;
        this.commands = commands;
    }

    private void processCommand(final MowerCommand cmd) {

    }

    public MowerPosition process() {
        return null;
    }
}
