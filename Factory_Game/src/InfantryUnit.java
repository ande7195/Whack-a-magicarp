/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anders
 */
public class InfantryUnit {

    int range;
    int armor;
    int hits;
    int damage;
    String name;
    private String race;

    public InfantryUnit(int range, int armor, int hits, int damage) {
        this.range = range;
        this.armor = armor;
        this.hits = hits;
        this.damage = damage;
        this.name = name;
        this.race= race;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void takeDamage(int damage) {
        int reduction = (int) (Math.random() * armor);
        if (damage > reduction) {
            hits = hits - (damage - reduction);
            
        }else{
            System.out.println("the armor took all the damage");
        }
    }

    public void Attack(InfantryUnit unit) {
        int attackDamage = (int) (Math.random() * damage) + 1;
        
        System.out.println(name + " attacked" + unit.getName());
        unit.takeDamage(attackDamage);
        System.out.println(unit.name + " -" + attackDamage + " hits. Remaining:" + unit.hits);

    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

}
