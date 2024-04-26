package Proyecto.FACTORY.src.main.java.Main;

import java.util.HashMap;
import java.util.Map;

import Entities.TypeEnemy;
import ImplementacionesFungus.FungusAzul;
import ImplementacionesFungus.FungusImpRed;

// THIS IS THE FACTORY THE ONE WHO PROVIDES ME WITH PRODUCTS ONLY WITH MY CHOICE
public class MainFactory {

    
    
    // Here save all types of enemy and avoid use SWITHC-CASE
    TypeEnemy j = TypeEnemy.ANGELWING_GOLD;
    private final static Map<TypeEnemy, Enemy> AvailableEnemys= new HashMap<>() {
        {
            
            put(TypeEnemy.ICE, new FungusAzul());
            put(TypeEnemy.BABY, new FungusImpRed());
            put(TypeEnemy.ANGELWING_GOLD, new FungusImpRed());
            put(TypeEnemy.ANGELWING_SIVEL, new FungusImpRed());
        }
    };
    
    // METHOD TO GET  A DETERMINTE ENEMY
    /**
     * @param typeEnemySelected
     * @return
     */
    public Enemy getEnemySpecific(TypeEnemy typeEnemySelected){
        return AvailableEnemys.get(typeEnemySelected);
    }
    
    
    
    /*POINT VERY IMPORTANT: There is a typical problem is that to use this pattern,the products that i must obtain must be general,
    it isnt advisable to have 2 types of objects of almost the same type in this pattern, for example THE MAP only have a FUNGUN as a enemy,
    THE MAP shouldnt have subsclasses o other FUNGUS from the same group such as Fungu azul or fngu red, in this case is advasable to use The ASBTRACT FACTORY 
    which does provide me with the ability to have several subgroups IS THE DIFERENCE OF THE NORMAL FACTORY AND ABSTRACT FACTORY */
}
