package task6;
//Task 5

import java.util.Scanner;

public class Animal {
    String age;

    public void setAge() {
        this.age = setInformation();
    }

    public String setInformation() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        return str;
    }
}
