
import sun.security.acl.WorldGroupImpl;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anders
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
      /*  RockHauler rockHauler = new RockHauler(5, 0, 10, 1);
        SpearThrower spearThrower = new SpearThrower(5, 5, 20, 5);
        Archer archer = new Archer(10, 10, 25, 10);
        CrossbowMan crossbowMan = new CrossbowMan(10, 20, 30, 20);
        Musketeer musketeer = new Musketeer(50, 50, 50, 50);

        while (rockHauler.getHits() > 0 && spearThrower.getHits() > 0) {
            rockHauler.setName(" Simon");
            spearThrower.setName(" Jonas");
            rockHauler.Attack(spearThrower);
            spearThrower.Attack(rockHauler);
        }*/
   FactoryFactory factory = new FactoryFactory();
   InfantryFactory humanfactory = factory.createInfantryFactory(1);
   InfantryFactory orcfactory = factory.createInfantryFactory(2);
   InfantryUnit humanSoldier = humanfactory.createUnit(1);
   InfantryUnit orcSoldier = orcfactory.createUnit(1);
   while(humanSoldier.getHits()>0&&orcSoldier.getHits()>0){
       humanSoldier.setName(" human");
       orcSoldier.setName(" orc");
       humanSoldier.Attack(orcSoldier);
       orcSoldier.Attack(humanSoldier);
       System.out.println("*****************************");
       World europe = World.getInstance();
       System.out.println("the name of the world is "+europe.getName());
       System.out.println("****************************************************");
   }
    }
    

}
