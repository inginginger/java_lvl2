package src.java02.less01;

public class Main {

    public static void main(String[] args) {
        String[] names1 = {"Алексей", "Иван", "Павел", "Валерий"};
        String[] names2 = {"Андрей", "Александр", "Глеб", "Дмитрий"};
        int[] runDist1 = {1000, 800, 2000, 400};
        int[] runDist2 = {1000, 1500, 2000, 100};
        int[] jumpHeight1 = {2, 3, 1, 2};
        int[] jumpHeight2 = {3, 2, 2, 2};
        int[] swimDist1 = {100, 400, 60, 500};
        int[] swimDist2 = {800, 30, 100, 400};
        Team t1 = new Team(names1, runDist1, jumpHeight1, swimDist1);     // Создаем первую команду
        Team t2 = new Team(names2, runDist2, jumpHeight2, swimDist2);     // Создаем вторую команду
        Course[] course = {new Cross(100), new Wall(2), new Water(60),
                            new Water(100), new Cross(1000)};  // Создаем полосу препятствий
        for (int i = 0; i < Team.TEAM_SIZE; i++) {
            for (int j = 0; j < course.length; j++) {
                if(t1.members[i].isOnDistance())
                    course[j].doIt(t1.members[i]);
                if(t2.members[i].isOnDistance())
                    course[j].doIt(t2.members[i]);
            }
        }
    }
}
