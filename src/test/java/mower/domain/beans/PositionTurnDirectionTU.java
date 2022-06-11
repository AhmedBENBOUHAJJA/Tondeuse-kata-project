package mower.domain.beans;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PositionTurnDirectionTU {

	@Test
	public void turnLeftDirection() {

		/* Given */
		MowerPosition mowerPosition = new MowerPosition(5, 8, MowerDirection.North);

		/* When */
		MowerPosition clonePosition = mowerPosition.clone();
		clonePosition.turnLeftDirection();
		
		/* Then */
		assertEquals(clonePosition.getX(), 5);
		assertEquals(clonePosition.getY(), 8);
		assertEquals(clonePosition.getDirection(), MowerDirection.West);
	}
	
	@Test
	public void turnRightDirection() {

		/* Given */
		MowerPosition mowerPosition = new MowerPosition(5, 8, MowerDirection.North);

		/* When */
		MowerPosition clonePosition = mowerPosition.clone();
		clonePosition.turnRightDirection();

		/* Then */
		assertEquals(clonePosition.getX(), 5);
		assertEquals(clonePosition.getY(), 8);
		assertEquals(clonePosition.getDirection(), MowerDirection.East);
	}
}
