package com.bloomtech.welcomeletter.fileIO;

import java.io.*;
import java.util.Scanner;

public class FileManager {
    public FileManager() {
    }

    public String getTextFromFile(String filename) throws FileNotFoundException {
        StringBuilder returnString = new StringBuilder();

        File file = new File("src/resources/" + filename + ".txt");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            returnString.append(scanner.nextLine()).append("\n");
        }
        scanner.close();
        return returnString.toString();
    }

    public void writeTextToFile(String outFileName, String text) throws IOException {
        File file = new File("src/resources/out/" + outFileName + ".txt");
        file.createNewFile();
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/resources/out/" + outFileName + ".txt"));
        bufferedWriter.write(text);
        bufferedWriter.close();
    }
}