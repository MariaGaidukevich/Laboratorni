package task6;

//Task 5
public class Cat extends Animal {
    String name;

    public void setName() {
        this.name = setInformation();
    }

    @Override
    public String setInformation() {
        return super.setInformation();
    }
}