package mower.domain.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader implements Serializable {

    private static final long serialVersionUID = 1L;

        private static FileReader instance;
        private FileReader() {};

        public static FileReader getInstance() {
            if(instance == null) {
                instance = new FileReader();
            }
            return instance;
    }

    public List<String> read(final String fileName) throws FileNotFoundException {
        List<String> fileLine = new ArrayList<String>();

        File file = new File(fileName);

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                fileLine.add(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File is not found, please try again !");
            throw e;
        }

        return fileLine;
    }
}
