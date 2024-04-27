package Proyecto.FACTORY.src.main.java.ImplementationsWing;

import Entities.Enemy;

public class AngeWingGold implements Enemy{

    // This class is the product result of each identity interface
    @Override
    public void attack() {
        System.out.println("Fly " + 123);
        int a = 10;
        System.out.println("Fly CHCOC " + a);
    }

    @Override
    public void fend() {
        System.out.println("MAIN LOP" + 93);
    }
    
}
