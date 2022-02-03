public class robot {
    public robot(String name, int hp) {
        this.setName(name);
        this.setHp(hp);

        System.out.println(" le robot " + this.getName() + " entre dans l'arene avec " + this.getHp() + " points de vie !  il est "+this.state);
    }

    private static String name;
    private static int hp;
    private static String state;


    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        robot.name = name;
    }

    public static int getHp() {
        return hp;
    }

    public static void setHp(int hp) {
        robot.hp = hp;
    }

    public static void diminHp(int hp) {
        robot.hp = hp - 2;
    }

    public static void fire(robot robot) {
        robot.setHp(robot.getHp() - 2);
    }

    public static String getState() {
        return state;
    }

    public static void setState(String state) {
        robot.state = state;
    }
    public static String isDead() {
        if (robot.hp <= 0)
        {
            robot.setState("mort");
        }
        else {
            robot.setState("vie");
        }
        return getState();
    }

}