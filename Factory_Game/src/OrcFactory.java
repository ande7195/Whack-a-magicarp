/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anders
 */
public class OrcFactory extends HumanFactory {
    public InfantryUnit createUnit(int techLevel){
        InfantryUnit orc;
        switch(techLevel){
            case 1:
                orc= new RockHauler(5, 5, 10, 5);
                break;
            case 2:
                orc= new SpearThrower(5, 10, 15, 7);
            case 3:
                orc= new Archer(5, 20, 25, 15);
            case 4:
                orc= new CrossbowMan(5, 30, 30, 20);
            case 5:
                orc= new Musketeer(5, 50, 50, 30);
            default:
            return null;
        }
  return orc;
}
