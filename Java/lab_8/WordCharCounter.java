import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class WordCharCounter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the name of the text file: ");
        String fileName = input.nextLine();

        File file = new File(fileName);
        int wordCount = 0;
        int charCount = 0;

        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();

                // Count words
                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }

                // Count characters excluding whitespace
                String noSpaces = line.replaceAll("\\s+", "");
                charCount += noSpaces.length();
            }

            System.out.println("Total words: " + wordCount);
            System.out.println("Total characters (excluding whitespace): " + charCount);
        } catch (IOException e) {
            System.out.println("Error: Could not open or read the file.");
        }

        input.close();
    }
}
