package Main;

import Entities.TypeEnemy;
import ImplementacionesFungus.Enemy;
import Proyecto.FACTORY.src.main.java.Main.MainFactory;

public class Menu {

    public static void main(String[] args) {

        MainFactory FirstWay = new MainFactory();
        
        // I just need to get any enemy child of the same interface and each one knows what to do (POLIMORFISM)
        // MY CHOICE WAS FUNG RED
        Enemy enemySelected = FirstWay.getEnemySpecific(TypeEnemy.BABY);
        System.out.println("MODIFYCACION PROBLEM");
        enemySelected.attack();
        +

    }

}
