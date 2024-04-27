package Main;

import Entities.TypeEnemy;
import ImplementacionesFungus.Enemy;
import Proyecto.FACTORY.src.main.java.Main.MainFactory;

public class Menu {

    public static void main(String[] args) {

        System.out.println("Select your type enemy to fight");
        // Here put a Menu to select a determinadate enemy
        MainFactory FirstWay = new MainFactory();
        
        // I just need to get any enemy child of the same interface and each one knows what to do (POLIMORFISM)
        // MY CHOICE WAS FUNG RED
        Enemy enemySelected = FirstWay.getEnemySpecific(TypeEnemy.BABY);
        enemySelected.attack();
        enemySelected.fend();
        enemySelected.fend();
        enemySelected.attack();
        System.out.println("MODIFYCACION PROBLEM");
        enemySelected.attack();
        enemySelected.fend();

    }

}
