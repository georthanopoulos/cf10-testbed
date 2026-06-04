package gr.aueb.cf.ch9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.UUID;

public class BinaryEx2 {

    public static void main(String[] args) {

        String userInput = "";
        int dotIndex;
        String extentionOfFile = "";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter file name: \n");

        userInput = getUserFile(scanner);

        Path inputpath = Path.of("C:/tmp/",userInput);
        Path outputpath = Path.of("C:/tmp/" +UUID.randomUUID().toString().replace(":", "_") + "_" + userInput);

        copyBinaryFile(inputpath, outputpath);

        System.out.println("\n--- FILE METADATA ---");
        System.out.println("The original file origin is: " + inputpath.toAbsolutePath());  //Absolute path (original file)
        System.out.println();
        System.out.println("The new file was saved HERE: " + outputpath.toAbsolutePath()); //absolute path (newly saved file)

        dotIndex = userInput.lastIndexOf(".");
        extentionOfFile = userInput.substring(dotIndex + 1);

        System.out.println();
        System.out.println("The file extension is: " + extentionOfFile);

    }

    public static void copyBinaryFile(Path source, Path target) {

        try (var sourceStream = Files.newInputStream(source);
             var targetStream = Files.newOutputStream(target)) {
            sourceStream.transferTo(targetStream);
            System.out.println("SUCCESS! File copied successfully to disk!");
        } catch (IOException e) {
            System.out.println("ERROR! File Could not be copied: " + e.getMessage());
        }
    }

    public static String getUserFile(Scanner scanner) {

        String fileName = "";                         //starting with empty String in order to trigger while loop

        while (fileName.isEmpty()) {                  //while fileName is empty prompt user and scan again
            fileName = scanner.nextLine();
            if (fileName.isEmpty()) {
                System.out.println("Please enter a valid file name: ");
            }
        }
        return fileName;
    }
}
