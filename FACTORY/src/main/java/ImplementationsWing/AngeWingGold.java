package ImplementationsWing;

import Entities.Enemy;

public class AngeWingGold implements Enemy{

    // This class is the product result of each identity interface
    @Override
    public void attack() {
        System.out.println("Fly and Hit Gold");
    }

    @Override
    public void fend() {
        System.out.println("Throw pieces of wings Gold");
    }
    
}
