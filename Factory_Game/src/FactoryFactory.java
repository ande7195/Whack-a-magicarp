/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anders
 */
public class FactoryFactory {
    public InfantryFactory createInfantryFactory(int race){
      HumanFactory humanFactory = new HumanFactory();
      OrcFactory orcFactory = new OrcFactory();
              
        if(race==1){
            return humanFactory;
        }if(race==2){
            return orcFactory;
        }else{
        return null;
    }
    }
    
    
}
