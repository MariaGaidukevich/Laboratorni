package task11;

public class JThread extends Thread {
    JThread(String name){
        super(name);
    }
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("State of Thread while is running:"+Thread.currentThread().getState());
        }
    }
}
