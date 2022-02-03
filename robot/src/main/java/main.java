

import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int morts=0;
        String ci;
        Scanner cible = new Scanner(System.in);
        System.out.println("Creation des robots de base :");
        robot gundamn = new robot("Gundamn",10);
        robot bumblebee = new robot("Bumblebee",10);

        robot.fire(bumblebee);
        robot.isDead();

    }

}
