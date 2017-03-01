/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anders
 */
public abstract class InfantryFactory {

    public InfantryUnit createUnit(int techLevel) {
        InfantryUnit charachter;
        switch (techLevel) {
            case 1:
                charachter = new RockHauler(5, 5, 10, 5);
                break;
            case 2:
                charachter = new SpearThrower(5, 10, 15, 7);
            case 3:
                charachter = new Archer(5, 20, 25, 15);
            case 4:
                charachter = new CrossbowMan(5, 30, 30, 20);
            case 5:
                charachter = new Musketeer(5, 50, 50, 30);
            default:
                return null;
        }
        return charachter;
    }
}
