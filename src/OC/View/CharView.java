/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OC.View;

import OC.Model.CharModel;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

/**
 *
 * @author chris
 */
public class CharView extends VBox {
   /** Each character image will be in a pane */
   private StackPane image_Pane;
   
   /** Image Background which doesn't change*/
   private ImageView image_background;
   
   /** Image of the character */
   private ImageView image_character;
   
    /** Name of the character */
   private Label charName;
   
    /** Each character will have a level based of how well it's a suited
     * counter */
   private Label lvl;
   
   /**CharModel is the model that the view is base off from*/
   private CharModel character;
   
   public CharView(CharModel model){
       character=model;
       init();
       
   }
   /*
   Initiallize the charView by initializing the main compoanents
   and adding it to the VBox superClass.
   */
   private void init(){
       image_Pane= new StackPane();
       image_Pane.getStyleClass().add("selection");
       image_character=new ImageView(new Image("file:" + character.getImgURL()));
       image_background= new ImageView();
       charName=new Label(character.getName().toUpperCase());
       charName.getStyleClass().add("label_name");
       
       
       
       image_Pane.getChildren().addAll(image_background,image_character);
       
       //Add the pane and the character to the vbox superclass
       super.getChildren().addAll(image_Pane,charName);
       super.setAlignment(Pos.CENTER);
       super.setSpacing(3);
   }
   
   
  /**
   * Sets the level of the label
   * @param num is the new value of level in the label
   * @return the new label with its new level
   */ 
   public Label setLevel(int num){
       if(lvl==null)
         lvl= new Label(""+num);
       else
           lvl.setText(""+num);    
       
       return lvl;
   }
   
   public void setSmall(){
            
   }
   
   /**
    * This sets the background image of the character
    * @param backIMG the string of the location of the image
    */
   public void setBackground(String backIMG){
       image_background=new ImageView(new Image(backIMG));
       
   }
   
   
   
   
   
    
}
