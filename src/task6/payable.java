package task6;

//Task 2
public interface payable {
    default void printAccount() {
        System.out.println("Account is empty");
    }
}
