package task5;

public class Main {
    public static void main(String[] args) {
        // task1
        String longword = "one two three four five six seven eight";
        findLongword(longword);

        //task2
        String palindrom = "Madam";
        checkString(palindrom);

        //task3
        String before = "Жила-была бяка, которая не знала, что она бяка.";
        censoring(before);

        //task4
        String str = "Cегодня мама намазала хлеб маслом";
        String substr = "ма";
        countSubstring(str, substr);

        //task5
        String direct = "Ingne natura renovatur integra";
        backWord(direct);

    }

    //task 1 method
    public static void findLongword(String longword) {
        String[] words = longword.split(" ");
        System.out.println("The longest word(s):");
        int check = 0;
        for (String word : words) {
            if (word.length() > check) {
                check = word.length();
            }
        }
        for (String word : words) {
            if (word.length() == check) {
                System.out.println(word);
            }
        }
    }

    //task2 method
    public static void checkString(String palindrom) {
        StringBuilder builder = new StringBuilder(palindrom);
        String palindrom2 = builder.reverse().toString();
        if (palindrom.equalsIgnoreCase(palindrom2)) {
            System.out.println("Palindrom detected");
        } else {
            System.out.println("Palindrom not detected");
        }
    }

    //task 3 method
    public static void censoring(String before) {
        System.out.println(before.replace("бяка", "[вырезано цензурой]"));
    }

    //task 4 method
    public static void countSubstring(String str, String substr) {
        String str1 = str.replace(substr, "");
        System.out.printf("Количество вхождений подстроки: %d\n", (str.length() - str1.length()) / substr.length());
    }

    //task 5 method
    public static void backWord(String direct) {
        System.out.printf("The given string is: %s\n", direct);
        String[] words = direct.split(" ");
        String reversed = "";
        for (String word : words) {
            StringBuilder builder2 = new StringBuilder(word);
            reversed += builder2.reverse() + " ";
        }
        System.out.printf("The string reversed word by word is: \n%s\n", reversed.trim());
    }

}