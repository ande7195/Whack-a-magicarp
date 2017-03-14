/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess_game;

import javafx.scene.paint.Color;

/**
 *
 * @author Anders
 */
public abstract class ChessPiece {
private String name;
private Color color;
private int xPosition;
private int yPosition;
public ChessPiece(String name, Color color,int xPosition,int yPosition){
    this.name=name;
    this.color=color;
    this.xPosition=xPosition;
    this.yPosition=yPosition;

}
 public void canMoveTo(int x,int y){
     if(( x>=0 && x <=7 )&&( y>=0 && y <=7 )&&
             (x!=xPosition)&&y!=yPosition)
             {
         
         
     }
     
 
 }
public void positionOnField(int x, int y){
   
        
    }    
            
    }
        
}
}
