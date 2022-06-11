package mower.domain.utils;

import mower.domain.beans.MowerDirection;
import mower.domain.beans.MowerPosition;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConvertorInitialPositionLineTU {

	@Test
	public void convert() {
		/* Given */
		final String commandLine = "5 2 N";
		Boolean result = true;
		ConvertorInitialPositionLine convertor = new ConvertorInitialPositionLine(commandLine);
		
		/* When */
		try {
			MowerPosition position = convertor.convert();
			
		/* Then */
			assertTrue(result);
			assertNotNull(commandLine);
			String[] split = commandLine.split(" ");
			assertEquals(Integer.valueOf(split[0]).intValue(), position.getX());
			assertEquals(Integer.valueOf(split[1]).intValue(), position.getY());
			assertEquals(MowerDirection.getDirectionFromCode(split[2]), position.getDirection());
		} catch (Exception e) {
			assertFalse(result);
		}
	}
}