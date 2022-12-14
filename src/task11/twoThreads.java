package task11;

public class twoThreads extends Thread{
    private Object locker;
    public twoThreads(Object locker){
        this.locker=locker;
    }

    @Override
    public void run() {
        while(true){
            synchronized (locker){
                try{
                    System.out.println(getName());
                    locker.notify();
                    locker.wait();
                }
                catch (InterruptedException e){System.err.println();}
            }
        }
    }
}
