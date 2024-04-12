package Main;

import Entities.Enemy;
import Entities.TypeEnemy;

public class Menu {

    public static void main(String[] args) {

        System.out.println("Select your type enemy to fight");
        // Here put a Menu to select a determinadate enemy
        MainFactory FirstWay = new MainFactory();
        
        // I just need to get any enemy child of the same interface and each one knows what to do (POLIMORFISM)
        // MY CHOICE WAS FUNG RED
        Enemy enemySelected = FirstWay.getEnemySpecific(TypeEnemy.FUNGU_RED);
        enemySelected.attack();
        enemySelected.fend();
        
        // NOW MY CHOICE WAS ANGEL WING 
        Enemy enemySelected2 = FirstWay.getEnemySpecific(TypeEnemy.ANGELWING_SIVEL);
        enemySelected2.attack();
        enemySelected2.fend();

    }

}
