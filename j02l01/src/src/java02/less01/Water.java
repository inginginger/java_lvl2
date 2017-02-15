package src.java02.less01;

public class Water extends Course {
    private int length;

    public Water(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Participant o) {
        o.swim(length);
    }
}
