package src.less05.threads;

public class Main {

    public static void main(String[] args) {
        Multithreading thr1 = new Multithreading();
        Multithreading thr2 = new Multithreading();
        thr1.firstCounter();
        thr2.secondCounter();
    }
}
