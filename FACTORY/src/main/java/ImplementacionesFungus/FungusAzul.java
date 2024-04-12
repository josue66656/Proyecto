package Proyecto.FACTORY.src.main.java.ImplementacionesFungus;
import Entities.Enemy;
/*Point important : To apply the factory pattern, all products must BE CHILDREN OF THE SAME IDENTITY and there must ONLY FAACTORY
If I want to have more FACTORIES and have the option of choosing one of these FACTORIES, in the case the ABSTRACT FACTORY is used*/
public class FungusAzul implements Enemy{

    @Override
    public void attack() {
        System.out.println("Fungus attack Blue");
    }

    @Override
    public void fend() {
        System.out.println(" fend fungu Blue");
    }
    
}
