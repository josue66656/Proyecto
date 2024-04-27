package ImplementationsWing;
import Entities.Enemy;
public class AngelWingSilver implements Enemy{

    @Override
    public void attack() {
        System.out.println("ATTACK GOLD");
    }

    @Override
    public void fend() {
        System.out.println("FEND GOLD");
    }
}
