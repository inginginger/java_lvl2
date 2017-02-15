package src.java02.less01;

public class Wall extends Course {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Participant o) {
        o.jump(height);
    }
}

