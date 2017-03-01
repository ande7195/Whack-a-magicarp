/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anders
 */
public class FactoryFactory extends InfantryFactory {

    public InfantryFactory createInfantryFactory(int race) {
        HumanFactory humanFactory = new HumanFactory();
        OrcFactory orcFactory = new OrcFactory();
        InfantryFactory factory;
        switch (race) {
            case 1:
            factory = new HumanFactory();
            break;
            case 2:
            factory = new OrcFactory();
            break;
            default:
            return null;
        }
        return factory;
    }

}
