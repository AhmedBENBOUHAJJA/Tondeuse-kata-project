package mower.domain.utils;

import mower.domain.beans.MowerCommand;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ConvertorCommandLineTU {
	
	@Test
	public void convert() {

		/* Given */
		final String commandLine = "GDAAGAADAA";
		Boolean result = true;
		ConvertorCommandLine convertor = new ConvertorCommandLine(commandLine);
		
		/* When */
		try {
			List<MowerCommand> commands = convertor.convert();
			
		/* Then */
			assertTrue(result);
			assertNotNull(commands);
			assertEquals(commandLine.length(), commands.size());
			
			char[] charArrayCmds = commandLine.toCharArray();
			
			for (int i = 0; i < charArrayCmds.length; i++) {
				assertEquals(String.valueOf(charArrayCmds[i]), commands.get(i).getCode());
			}
		} catch (Exception e) {
			assertFalse(result);
		}
	}
}
