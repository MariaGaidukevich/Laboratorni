package task10;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //1
        File file = new File("files/text.txt");
        System.out.println(showFile(file));
        //2
        File file2 = new File("files/text2.txt");
        addString(file2, "Запись строки");
        //3
        File file3 = new File("files/text3.txt");
        File file4 = new File("files/text4.txt");
        addString(file3, showFile(file4));
        //4
        File file5 = new File("files/text5.txt");
        changeToDollar(file5);
    }

    //method 1
    public static List<String> showFile(File file) {
        List<String> textStrings = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String input;
            while ((input = reader.readLine()) != null) {
                textStrings.add(input);
            }

        } catch (IOException e) {
            System.err.println("Error:" + e.getMessage());
        }
        return textStrings;
    }

    // method 2
    public static void addString(File file, String string) {
        try (FileWriter writer = new FileWriter(file, false)) {
            writer.write(string);


        } catch (IOException e) {
            System.err.println("Error:" + e.getMessage());
        }

    }

    //method 3(overload)
    public static void addString(File file, List<String> list) {
        String str = "";
        for (int i = 0; i < list.size(); i++) {
            str += "\n" + list.get(i);
        }
        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write(str);


        } catch (IOException e) {
            System.err.println("Error:" + e.getMessage());
        }
    }

    // method 4
    public static void changeToDollar(File file) {
        String text="";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String input;
            while ((input = reader.readLine()) != null) {
              text+=input.replaceAll("\\p{Punct}|\\s","\\$")+"\n";
            }

        } catch (IOException e) {
            System.err.println("Error:" + e.getMessage());
        }
        try (FileWriter writer = new FileWriter(file, false)) {
            writer.write(text);


        } catch (IOException e) {
            System.err.println("Error:" + e.getMessage());
        }
    }
}