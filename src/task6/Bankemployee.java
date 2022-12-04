package task6;

//Task 1
public class Bankemployee extends Human implements payable {
    public String bankName;

    Bankemployee(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }

    @Override //Task 2
    public void printAccount() {
        payable.super.printAccount();
    }

    @Override
    void info() {
        System.out.printf("Name:%s Surname:%s Bankname:%s\n", super.getName(), super.getSurname(), bankName);
    }
}
