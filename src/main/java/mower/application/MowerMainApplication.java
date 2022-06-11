package mower.application;

import mower.domain.beans.MowerPosition;
import mower.domain.utils.FileReader;
import java.io.Serializable;
import java.util.List;

public class MowerMainApplication  implements Serializable {

    private static final long serialVersionUID = 1L;

    public static void main(final String[] args) throws Exception {

            if (args == null || args.length == 0) {
                System.out.println("Filename is mandatory (obligatoire) !");
                throw new Exception();
            }

            List<String> fileLine = FileReader.getInstance().read(args[0]);

            List<MowerPosition> positions = new MowerControl(fileLine).process();

            System.out.println("****************** Results **********************");
            for (int i = 0; i < positions.size(); i++) {
                System.out.println("   " + i + " : Mower ( Tondeuse ) final position : " + positions.get(i));
            }
            System.out.println("*************************************************");
    }
}
