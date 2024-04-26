package hust.soict.globalict.garbage;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {
    public static void main(String[] args) throws Exception {
        String filename = "test.exe"; // Name or path of the executable file
        byte[] inputBytes; // Byte array to hold file content
        long startTime, endTime; // Variables for timing measurements

        // Read all bytes from the specified file
        inputBytes = Files.readAllBytes(Paths.get(filename));

        // Start timing
        startTime = System.currentTimeMillis();

        // Create an empty string to store the file content
        StringBuilder outputStringBuilder = new StringBuilder();
        for(byte b : inputBytes) {
        	outputStringBuilder.append((char)b);
        }

        // End timing
        endTime = System.currentTimeMillis();

        // Calculate and print the elapsed time
        System.out.println("Time taken: " + (endTime - startTime) + " ms");
    }
}
