package task5;

public class Main {
    public static void main(String[] args) {
        // task1
        String longword = "one two three, four five six seven! eight";
        System.out.printf("The longest word is:%s\n",findLongword(longword));

        //task2
        String palindrom = "Madam";
       System.out.printf("Palindrom:%b\n",checkString(palindrom));

        //task3
        String before = "Жила-была бяка, которая не знала, что она бяка.";
        System.out.println(censoring(before, "бяка", "[Вырезано цензурой]"));

        //task4
        String str = "Cегодня мама намазала хлеб маслом";
        String substr = "ма";
        System.out.printf("Количество вхождений подстроки: %d\n", countSubstring(str, substr));

        //task5
        String direct = "Ingne natura renovatur integra";
        System.out.printf("The string reversed word by word is: \n%s\n",backWord(direct));

    }

    //task 1 method
    public static String findLongword(String longword) {
        String[] words = longword.split("\\s|\\p{P}");
        int check = 0;
        String longest="";
        for (String word : words) {
            if (word.length() > check) {
                check = word.length();
            }
        }
        for (String word : words) {
            if (word.length() == check) {
                longest=word;
                break;
            }
        }
        return longest;
    }

    //task2 method
    public static boolean checkString(String palindrom) {
        StringBuilder builder = new StringBuilder(palindrom);
        String palindrom2 = builder.reverse().toString();
       return palindrom.equalsIgnoreCase(palindrom2);


    }

    //task 3 method
    public static String censoring(String before, String badword, String replace) {
        return before.replace(badword, replace);
    }

    //task 4 method
    public static int countSubstring(String str, String substr) {
        String str1 = str.replace(substr, "");
        return (str.length() - str1.length()) / substr.length();
    }

    //task 5 method
    public static String backWord(String direct) {
        System.out.printf("The given string is: %s\n", direct);
        String[] words = direct.split(" ");
        String reversed = "";
        for (String word : words) {
            StringBuilder builder2 = new StringBuilder(word);
            reversed += builder2.reverse() + " ";
        }
        return reversed.trim();
    }

}