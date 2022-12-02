package task6;

public class Main {
    public static void main(String[] args) {
        //task 1
        Customer me = new Customer("Maria", "Itskovich", "SPb");
        Bankemployee kathi = new Bankemployee("Katharina", "Itskovich", "Tinkoff");
        me.info();
        kathi.info();

        //task 2
        me.printAccount();
        kathi.printAccount();

        //task 3
        Truck kamaz = new Truck(5, "kamaz", 'b', 120.5F, 6, 3.5F);
        kamaz.newWheels(8);
        kamaz.outPut();

        //task 4
        Trex rex = new Trex();
        rex.getMass();

        //task 5
        Animal animal = new Animal();
        animal.setAge();
        System.out.printf("Animal age is %s\n", animal.age);
        Cat cat = new Cat();
        cat.setName();
        System.out.printf("Cat's name is %s\n", cat.name);
    }
}
