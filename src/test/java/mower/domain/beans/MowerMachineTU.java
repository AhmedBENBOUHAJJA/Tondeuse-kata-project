package mower.domain.beans;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MowerMachineTU {

	@Test
	public void mowerProcess() {
		/* Given */
		GardenLimits limit = new GardenLimits(3, 8);
		MowerPosition position = new MowerPosition(1, 5, MowerDirection.West);
		List<MowerCommand> cmds = Arrays.asList(MowerCommand.Avance, MowerCommand.Avance, MowerCommand.Gauche, MowerCommand.Avance);
		final MowerPosition finalPosition = new MowerPosition(0, 4, MowerDirection.South);

		/* When */
		try {
			MowerMachine mowerMachine = new MowerMachine(limit, position, cmds);
			MowerPosition resultPosition = mowerMachine.process();
			
		/* Then */
			assertNotNull(finalPosition);
			assertEquals(finalPosition.getX(), resultPosition.getX());
			assertEquals(finalPosition.getY(), resultPosition.getY());
			assertEquals(finalPosition.getDirection(), resultPosition.getDirection());
		} catch (Exception e) {
			assertNull(finalPosition);
		}
	}
}
