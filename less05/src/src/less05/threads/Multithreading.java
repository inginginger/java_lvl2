package src.less05.threads;

public class Multithreading {
    static final int size = 10000000;
    static final int h = size / 2;
    float arr[];

    public Multithreading() {
        this.arr = new float[size];
        for (int i = 0; i < size; i++) {
            arr[i] = 1;
        }
    }

    public void firstCounter() {
        long a = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("Result first counter: " + (System.currentTimeMillis() - a));
    }

    public void secondCounter() {
        long a = System.currentTimeMillis();
        MyThread thr1 = new MyThread(0, h);
        MyThread thr2 = new MyThread(h, size);
        thr1.start();
        thr2.start();
        try {
            thr1.join();
            thr2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.arraycopy(thr1.getArr(), 0, this.arr, 0, thr1.getArr().length);
        System.arraycopy(thr2.getArr(), 0, this.arr, thr1.getArr().length, thr2.getArr().length);
        System.out.println("Result second counter: " + (System.currentTimeMillis() - a));
    }

}
