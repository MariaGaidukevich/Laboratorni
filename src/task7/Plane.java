package task7;

public class Plane {
    static class Wing {
        float wingWeight;

        public void setWeight(float wingWeight) {
            this.wingWeight = wingWeight;
        }

        public void showWeight() {
            System.out.printf("Вес крыла составляет:%.1f\n", wingWeight);
        }
    }
}
