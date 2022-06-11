package mower.domain.beans;

import mower.domain.exceptions.InitialPositionMowerInvalidException;
import org.apache.log4j.Logger;

import java.io.Serializable;
import java.util.List;

public class MowerMachine implements Serializable {

    private static final long serialVersionUID = 1L;

    private static final Logger logger = Logger.getLogger(MowerMachine.class);

    private final MowerPosition position;
    private final GardenLimits limite;
    private final List<MowerCommand> commands;

    public MowerMachine(final GardenLimits limit, final MowerPosition position, final List<MowerCommand> commands) throws InitialPositionMowerInvalidException {

        if (!position.isValidPosition(limit)) {
            logger.error("Mower Initial position is invalid !");
            throw new InitialPositionMowerInvalidException();
        }

        this.position = position;
        this.limite = limit;
        this.commands = commands;
    }

    private void processCommand(final MowerCommand command) {

        switch(command) {
            case Avance :
                position.aheadIfPossible(limite);
                break;
            case Droite :
                position.turnRightDirection();
                break;
            case Gauche :
                position.turnLeftDirection();
                break;
        }

    }

    public MowerPosition process() {
        for(MowerCommand commands : commands) {
            processCommand(commands);
        }
        return position;
    }
}
