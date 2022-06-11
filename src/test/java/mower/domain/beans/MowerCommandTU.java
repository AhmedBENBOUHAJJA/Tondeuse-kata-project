package mower.domain.beans;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MowerCommandTU {
	
	@Test
	public void getCommandeFromValidCode() {

		/* When */
		MowerCommand commandeFromCode = MowerCommand.getCommandeFromCode("A");
		
		/* Then */
		assertEquals(MowerCommand.Avance, commandeFromCode);
	}

	@Test
	public void getCommandeFromInvalidCode() {

		/* When */
		MowerCommand commandeFromCode = MowerCommand.getCommandeFromCode("Z");

		/* Then */
		assertEquals(null, commandeFromCode);
	}
}