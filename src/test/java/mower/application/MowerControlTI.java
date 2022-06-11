package mower.application;

import mower.domain.beans.MowerPosition;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MowerControlTI {

    @Test
    public void process() throws Exception {

        /* Given */
        List<String> file = Arrays.asList("8 2", "4 1 E", "GAAADA");
        List<String> result = Arrays.asList("5 2 E");
        MowerControl startEngine = new MowerControl(file);

        /* When */
        List<MowerPosition> positions = startEngine.process();

        /* Then */
        assertNotNull(positions);
        assertEquals(result.size(), positions.size());

        for (int i = 0 ; i < positions.size() ; i++) {
            assertNotNull(positions.get(i));
            assertEquals(result.get(i), positions.get(i).toString());
        }
    }
}
