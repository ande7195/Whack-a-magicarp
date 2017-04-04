/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whacadiglett;


import java.lang.reflect.Array;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.util.Duration;
import java.util.ArrayList;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author Anders
 */
public class FXMLDocumentController implements Initializable {
    private Image image;
    private ImageView imageView;
    private ArrayList<ImageView> imageList;
    Random ran = new Random();
    ArrayList<Button> buttonList = new ArrayList();
    int buttonVisible = ran.nextInt(9)+1;
     int counter=0;
     private static int cycle=10;
     private static int duraction=1000;
    @FXML
    private Label label;
    @FXML
    private Button b1,b2,b3,b4,b5,b6,b7,b8,b9,bStart;
    @FXML
    private Label scorelabel;
    @FXML
   
    private void startGame(ActionEvent event) {
        
        counter=0;
        counter++;
        System.out.println(counter);
        refresh();
        
        Timeline timeline = new Timeline(new KeyFrame(
                Duration.millis(duraction),
                ae -> refresh()));
        timeline.setCycleCount(cycle);
        timeline.play();
     for (ImageView buttonImage : imageList) {
                    buttonImage.setVisible(true);
                }
              
            
        
    
    }
    public void buttonPressed(){
        
        counter++;
        scorelabel.setText(String.valueOf(counter));
       System.out.println("button Pressed");
          for (Button button : buttonList){
              button.setVisible(false); 
    }
  
      }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        image = new Image("file:.src/whacadiglett/Magikarp.png");
        imageList = new ArrayList();
        
        
          for (int i = 0; i < 9; i++) {

            imageView = new ImageView(image);
            imageView.setFitHeight(100);
            imageView.setFitWidth(100);
            imageView.setImage(image);
            imageView.setVisible(true);
            imageList.add(imageView); 
        }
    }
    
    
    public void refresh(){
        buttonList.add(b1);
        buttonList.add(b2);
        buttonList.add(b3);
        buttonList.add(b4);
        buttonList.add(b5);
        buttonList.add(b6);
        buttonList.add(b7);
        buttonList.add(b8);
        buttonList.add(b9);
        
        

        // Hide all the moles!
        for (Button button : buttonList) {
            button.setVisible(false);
        }

        // Reveal some random moles
        Random randomGenerator = new Random();
        int magikarps = randomGenerator.nextInt(7) + 1;
        for (int i = 0; i < magikarps; i++) {
            int selectedMagikarp = randomGenerator.nextInt(9);
            buttonList.get(selectedMagikarp).setVisible(true);
            
        }
       
    }
    
    }
    

