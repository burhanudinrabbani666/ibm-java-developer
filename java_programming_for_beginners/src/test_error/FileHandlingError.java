package java_programming_for_beginners.src.test_error;

import java.io.*;

public class FileHandlingError {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("nonexistenfile.txt");
            BufferedReader fileInput = new BufferedReader(file);

            // Reading file
            System.out.println(fileInput);
            fileInput.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } catch (IOException e) {
            System.out.println("Error: An I/O error occured.");
        }

    }
}
