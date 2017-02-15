package src.java02.less01;

public class Human implements Participant {
    protected String name;
    protected int maxRunDistance;
    protected int maxJumpHeight;
    protected int maxSwimDistance;
    protected boolean active;



    @Override
    public boolean isOnDistance() {
        return active;
    }

    public Human(String name, int maxRunDistance, int maxJumpHeight, int maxSwimDistance) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimDistance = maxSwimDistance;
        this.active = true;
    }

    public Human(){}

    @Override
    public void run(int dist) {
        if (dist <= maxRunDistance) {
            System.out.println(name + " пробежал успешно");
        } else {
            active = false;
            System.out.println(name + " не смог пробежать");
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(name + " перепрыгнул успешно");
        } else {
            active = false;
            System.out.println(name + " не смог перепрыгнуть");
        }
    }

    @Override
    public void swim(int dist) {
        if (maxSwimDistance >= dist) {
            System.out.println(name + " проплыл успешно");
        } else {
            active = false;
            System.out.println(name + " не смог проплыть");
        }
    }

    @Override
    public void printResults() {
        if (active) {
            System.out.println(name + " прошел всю дистанцию");
        } else {
            System.out.println(name + " не смог пройти дистанцию");
        }
    }
}
