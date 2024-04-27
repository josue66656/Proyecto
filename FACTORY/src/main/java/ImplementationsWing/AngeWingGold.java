package Proyecto.FACTORY.src.main.java.ImplementationsWing;

import Entities.Enemy;

public class AngeWingGold implements Enemy{

    // This class is the product result of each identity interface
    @Override
    public void attack() {
        int a = 10;
        System.out.println("Fly " + a);
    }

    @Override
    public void fend() {
        int v = 93;
        System.out.println("MAIN LOP" + 93);
    }
    
}
