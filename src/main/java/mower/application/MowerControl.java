package mower.application;

import mower.domain.beans.GardenLimits;
import mower.domain.beans.MowerCommand;
import mower.domain.beans.MowerMachine;
import mower.domain.beans.MowerPosition;
import mower.domain.utils.ConvertorCommandLine;
import mower.domain.utils.ConvertorGardenSizeLine;
import mower.domain.utils.ConvertorInitialPositionLine;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MowerControl implements Serializable {

    private static final long serialVersionUID = 1L;

    private final List<MowerMachine> mowers = new ArrayList<MowerMachine>();

    public MowerControl(final List<String> file) throws Exception {

        if (file == null || file.size() == 0) {
            System.out.println("File is empty !");
            throw new Exception();
        }

        Iterator<String> iterator = file.iterator();

        String gardenLimitLine = iterator.next();
        GardenLimits gardenLimit = new ConvertorGardenSizeLine(gardenLimitLine).convert();

        while (iterator.hasNext()) {
            String positionMowerLine = iterator.next();
            MowerPosition position = new ConvertorInitialPositionLine(positionMowerLine).convert();

            if (!iterator.hasNext()) {
                System.out.println("File format is invalid !");
                throw new Exception();
            }

            String mowerCommands = iterator.next();
            List<MowerCommand> commands = new ConvertorCommandLine(mowerCommands).convert();

            MowerMachine mower = new MowerMachine(gardenLimit, position, commands);
            mowers.add(mower);
        }
    }

    public List<MowerPosition> process() {
        List<MowerPosition> position = new ArrayList<MowerPosition>(mowers.size());
        for(MowerMachine mower : mowers) {
            position.add(mower.process());
        }
        return position;
    }
}
