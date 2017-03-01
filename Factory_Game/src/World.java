/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anders
 */
public class World {
    private String name;
    private static World europe;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static World getEurope() {
        return europe;
    }

    public static void setEurope(World europe) {
        World.europe = europe;
    }
    World(){
        
        
    }
    public static World getInstance(){
        if (europe instanceof World){
            
        }else{
            europe = new World();
        }
        europe.name="Europe";
        return europe;
    }
}
