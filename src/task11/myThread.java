package task11;

public class myThread extends Thread{
    Counter counter;
    myThread(Counter counter){
        this.counter=counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
            System.out.println(counter.getCount());
        }
    }
}
