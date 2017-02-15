package src.java02.less01;

public class Cross extends Course{
    private int length;

    public Cross(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Participant o) {
        o.run(length);
    }
}
