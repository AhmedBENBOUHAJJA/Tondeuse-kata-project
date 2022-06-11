package mower.domain.utils;

import mower.domain.beans.GardenLimits;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConvertorGardenSizeLineTU {
	
	@Test
	public void convert() {
		/* Given */
		final String commandLine = "5 -2";
		Boolean result = false;
		ConvertorGardenSizeLine convertor = new ConvertorGardenSizeLine(commandLine);
		
		/* When */
		try {
			GardenLimits gl = convertor.convert();
			
		/* Then */
			assertTrue(result);
			assertNotNull(commandLine);
			String[] split = commandLine.split(" ");
			assertEquals(Integer.valueOf(split[0]).intValue(), gl.getX());
			assertEquals(Integer.valueOf(split[1]).intValue(), gl.getY());
		} catch (Exception e) {
			assertFalse(result);
		}
	}
}