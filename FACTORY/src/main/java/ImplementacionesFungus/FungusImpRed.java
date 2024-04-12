package Proyecto.FACTORY.src.main.java.ImplementacionesFungus;
import Entities.Enemy;
public class FungusImpRed implements Enemy{

    @Override
    public void attack() {
        System.out.println("Atack Fungus stink Red");
    }

    @Override
    public void fend() {
        System.out.println("Defend StandAndHit Red");
    }
    
}
