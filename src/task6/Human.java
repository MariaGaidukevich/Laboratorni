package task6;

//task 1
public abstract class Human {
    String name;
    String surname;

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    abstract void info();
}
