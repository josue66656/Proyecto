package Proyecto.FACTORY.src.main.java.Main;

import java.util.HashMap;
import java.util.Map;

import Entities.Enemy;
import Proyecto.FACTORY.src.main.java.Entities.TypeEnemy;
import Proyecto.FACTORY.src.main.java.ImplementacionesFungus.FungusAzul;
import Proyecto.FACTORY.src.main.java.ImplementacionesFungus.FungusImpRed;
import Proyecto.FACTORY.src.main.java.ImplementationsWing.AngeWingGold;
import Proyecto.FACTORY.src.main.java.ImplementationsWing.AngelWingSilver;

// THIS IS THE FACTORY THE ONE WHO PROVIDES ME WITH PRODUCTS ONLY WITH MY CHOICE
public class MainFactory {

    
    
    // Here save all types of enemy and avoid use SWITHC-CASE
    TypeEnemy j = TypeEnemy.ANGELWING_GOLD;
    private final static Map<TypeEnemy, Enemy> AvailableEnemys= new HashMap<>() {
        {
            
            put(TypeEnemy.FUNGU_AZUL, new FungusAzul());
            put(TypeEnemy.FUNGU_RED, new FungusImpRed());
        }
    };
    
    // METHOD TO GET  A DETERMINTE ENEMY
    public Enemy getEnemySpecific(TypeEnemy typeEnemySelected){
        return AvailableEnemys.get(typeEnemySelected);
    }
    
    
    
    /*POINT VERY IMPORTANT: There is a typical problem is that to use this pattern,the products that i must obtain must be general,
    it isnt advisable to have 2 types of objects of almost the same type in this pattern, for example THE MAP only have a FUNGUN as a enemy,
    THE MAP shouldnt have subsclasses o other FUNGUS from the same group such as Fungu azul or fngu red, in this case is advasable to use The ASBTRACT FACTORY 
    which does provide me with the ability to have several subgroups IS THE DIFERENCE OF THE NORMAL FACTORY AND ABSTRACT FACTORY */
}
