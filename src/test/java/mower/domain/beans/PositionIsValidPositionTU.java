package mower.domain.beans;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PositionIsValidPositionTU {

	@Test
	public void aheatIfPossible() {
		/* Given */
		MowerPosition mowerPosition = new MowerPosition(-1, 5, MowerDirection.West);
		GardenLimits limit = new GardenLimits(5, 5);
		/* When */
		boolean validPosition = mowerPosition.isValidPosition(limit);
		
		/* Then */
		assertEquals(validPosition, false);
	}
}
