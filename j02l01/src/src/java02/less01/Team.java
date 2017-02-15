package src.java02.less01;


public class Team extends Human{
    final static int TEAM_SIZE = 4;
    public final Human [] members = new Human[TEAM_SIZE];

    public Team (String [] name, int [] maxRunDistance, int [] maxJumpHeight, int [] maxSwimDistance){
        for (int i = 0; i < members.length; i++) {
            members[i] = new Human(name[i], maxRunDistance[i], maxJumpHeight[i], maxSwimDistance[i]);
        }
    }


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

