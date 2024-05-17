package other;

import java.io.FileWriter;
import java.io.IOException;

public class WriteAlphabetToFile {
    public static void main(String[] args) {
        FileWriter writer = null;
        try {
            writer = new FileWriter("alphabet.txt");
            for (char ch = 'A'; ch <= 'J'; ch++) {
                writer.write(ch);
                writer.write('\n');
            }
        } catch (IOException e) {
            System.out.println("Error occured while writing: " + e.getMessage());
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                System.out.println("Error occured while closing/opening: " + e.getMessage());
            }
        }
    }
}
