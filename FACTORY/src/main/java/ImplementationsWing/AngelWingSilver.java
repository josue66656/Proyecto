package ImplementationsWing;
import Entities.Enemy;
public class AngelWingSilver implements Enemy{

    @Override
    public void attack() {
        System.out.println("Fly and Hit Gold");
    }

    @Override
    public void fend() {
        System.out.println("Throw pieces of wings Gold");
    }
}
