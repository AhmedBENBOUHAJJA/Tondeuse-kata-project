package mower.domain.beans;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PositionAheatIfPossibleTU {

	@Test
	public void aheatIfPossible() {

		/* Given */
		MowerPosition mowerPosition = new MowerPosition(5, 5, MowerDirection.North);
		GardenLimits limit = new GardenLimits(5, 5);

		/* When */
		mowerPosition.aheadIfPossible(limit);
		
		/* Then */
		assertEquals(mowerPosition.getX(), 5);
		assertEquals(mowerPosition.getY(), 5);
	}
}
