package mower.application;

import mower.domain.beans.*;
import mower.domain.utils.ConvertorCommandLineTU;
import mower.domain.utils.ConvertorGardenSizeLineTU;
import mower.domain.utils.ConvertorInitialPositionLineTU;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses(value={
        ConvertorCommandLineTU.class,
        ConvertorGardenSizeLineTU.class,
        ConvertorInitialPositionLineTU.class,
        PositionTurnDirectionTU.class,
        PositionAheatIfPossibleTU.class,
        PositionIsValidPositionTU.class,
        MowerCommandTU.class,
        MowerDirectionTU.class,
        MowerMachineTU.class,
        MowerControlTI.class,
})

public class MowerMainApplicationTests {

}
