package task11;

public class Main {
    public static void main(String[] args) {
        // task1
        runThread(10);
        // task2
        stateOfThread();
        // task3
        oneHundredThousand();
        // task4
        namesOfThreads();


    }

    //method 1
    public static void runThread(int numberThread) {
        for (int i = 0; i < numberThread; i++) {
            new newThread().start();
        }
    }
//method 2
    public static void stateOfThread(){
        JThread jthread = new JThread("JThread");
        System.out.println("State of Thread before running: "+jthread.getState());
        jthread.start();
        System.out.println("State of Thread after running: "+jthread.getState());
    }

    //method 3
    public static void oneHundredThousand() {
        Counter counter = new Counter();
        for (int i = 0; i < 100; i++) {
            myThread t = new myThread(counter);
            t.start();
        }
    }

    // method 4
    public  static  void namesOfThreads(){
        Object locker = new Object();
        twoThreads th1 = new twoThreads(locker);
        th1.start();
        twoThreads th2 = new twoThreads(locker);
        th2.start();
    }
}