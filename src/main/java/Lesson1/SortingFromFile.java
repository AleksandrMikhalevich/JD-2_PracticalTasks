package Lesson1;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Alex Mikhalevich
 * @version 1.0
 * @create 2022-03-19 12:32
 */
public class SortingFromFile {

    public static void main(String[] args) {
        List<String> lines = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader(new File("").getAbsolutePath() +
                    "\\src\\main\\java\\Lesson1\\in.txt");
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line);
            }
            System.out.println(lines);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert bufferedReader != null;
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Collections.sort(lines);
        FileWriter writer = null;
        try {
            writer = new FileWriter(new File("").getAbsolutePath() +
                    "\\src\\main\\java\\Lesson1\\out.txt");
            for (String string : lines) {
                writer.write(string + "\r\n");
            }
            System.out.println("\n" + lines);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert writer != null;
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
