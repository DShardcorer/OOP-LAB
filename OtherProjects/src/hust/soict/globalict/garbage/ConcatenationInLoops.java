package hust.soict.globalict.garbage;

public class ConcatenationInLoops {
    public static void main(String[] args) {
        // Create a Random instance with a seed for reproducibility
        java.util.Random r = new java.util.Random(123);

        // Measure the time for simple string concatenation in a loop
        long start = System.currentTimeMillis(); // Get current time in milliseconds
        String s = ""; // Initialize an empty string

        // Concatenate a random binary digit (0 or 1) to the string 65536 times
        for (int i = 0; i < 65536; i++) {
            s += r.nextInt(2); // Append a random binary digit to the string
        }

        // Calculate and display the time taken for concatenation
        long elapsed = System.currentTimeMillis() - start; // Compute the elapsed time
        System.out.println("Time for concatenation: " + elapsed + " ms"); // Print elapsed time

        // Reset the random generator and start time
        r = new java.util.Random(123);
        start = System.currentTimeMillis();

        // Use a StringBuilder to build the string more efficiently
        StringBuilder sb = new StringBuilder();

        // Append random binary digits to the StringBuilder
        for (int i = 0; i < 65536; i++) {
            sb.append(r.nextInt(2)); // Append a random binary digit
        }

        // Convert the StringBuilder to a string
        s = sb.toString(); // Convert the StringBuilder to a string

        // Calculate and display the time taken for StringBuilder
        elapsed = System.currentTimeMillis() - start;
        System.out.println("Time for StringBuilder: " + elapsed + " ms"); // Print elapsed time
    }
}

