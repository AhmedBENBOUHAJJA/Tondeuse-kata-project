package mower.domain.beans;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MowerDirectionTU {
	
	@Test
	public void getDirectionFromCode() {
		/* When */
		MowerDirection directionFromCode = MowerDirection.getDirectionFromCode("N");
		
		/* Then */
		assertEquals(MowerDirection.North, directionFromCode);
	}
	
	@Test
	public void getLeftDirection() {
		/* When */
		MowerDirection directionLeft = MowerDirection.getDirectionFromCode("S");
		
		/* Then */
		assertEquals(MowerDirection.South, directionLeft);
	}
	
	@Test
	public void getRightDirection() {
		/* When */
		MowerDirection directionRight = MowerDirection.getDirectionFromCode("E");
		
		/* Then */
		assertEquals(MowerDirection.East, directionRight);
	}
}