package task6;

//Task 3
public class Truck extends Car {
    int numWheel;
    float mass;

    public Truck(int weight, String model, char color, float speed, int numWheel, float mass) {
        super(weight, model, color, speed);
        this.numWheel = numWheel;
        this.mass = mass;
    }

    public void newWheels(int numWheel) {
        this.numWheel = numWheel;
        System.out.printf("Количество колес:%d\n", numWheel);
    }

    @Override
    public void outPut() {
        super.outPut();
        System.out.println("Количество колес - " + numWheel + " и её грузоподъемность - " + mass);
    }

}
