package workClasses;

import abstractClasses.Infantry;
import abstractClasses.Unit;

import java.util.ArrayList;

public class Rogue extends Infantry {


    public Rogue(String name, int x, int y, int damage, int health) {
        super(name, x, y, damage, health);
    }

    public void stealGun() {  // украсть оружие

    }

    public void stealthMode() {  //для перехода в режим скрытности.
    }

    @Override
    public void step(ArrayList<Unit> team1, ArrayList<Unit> team2) {
        double minDistance = Double.MAX_VALUE;
        String closestEnemyName = "";


        for (Unit enemy : team1) {
            double distance = this.location.minDistance(enemy.getLocation());
            if (distance < minDistance) {
                minDistance = distance;
                closestEnemyName = enemy.getInfo();
            }
        }

        System.out.println("Closest enemy for Rouge: " + closestEnemyName);
        System.out.println("Distance: " + minDistance);
    }
}