package task11;

public class Counter {
    volatile int count = 0; //возникали одинаковые значения, поэтому при помощи volatile все потоки работают с одной переменной

    //Возникал race condition, нужно было синхронизировать потоки, для этого добавила synchrinized
    public synchronized void increment() {
        count = count + 1;
    }

    public int getCount() {
        return count;
    }
}
