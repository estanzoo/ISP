/*
Group Members: Ethan Zhu, Sean Zhang, Leo Liu
Date: 2022-05-20
Program: This program is the Main method for our game.
Hours: 4
*/
//These are the many import statements used to import all the needed javafx modules
import java.io.FileInputStream; 
import java.io.FileNotFoundException; 
import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;  
import javafx.stage.Stage;   
import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.paint.Color;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.Cursor;

public class Main extends Application {
   
   private int menuChoice = 0;
   
   //This is the start method, inherited and overriden from the Application class
   public void start (Stage stage) throws FileNotFoundException
   {
      stage.setTitle("Going Bananas");
      Image icon = new Image("/Images/General/logo.png");
      stage.getIcons().add(icon);
      stage.setWidth(1280);
      stage.setHeight(720);
      stage.setResizable(false);
      stage.setX(0);
      stage.setY(0);
      Scene menu = Menu.createMenu();
      Scene lvl1 = LevelOne.createLevelOne();
      stage.setScene(menu);
   
      menu.setOnMouseClicked(
            new EventHandler<MouseEvent>() {
               @Override
               public void handle(MouseEvent event) {
                  int x = (int)event.getX();
                  int y = (int)event.getY();
                  if (menuChoice == 0 && x >= 90 && x <= 195 && y >= 430 && y <= 455)
                  {
                     menuChoice = 1;
                     stage.setScene (lvl1);
                  }
                  else if (menuChoice == 0 && x >= 90 && x <= 350 && y >= 485 && y <= 515)
                  {
                     menuChoice = 2;
                  }
                  else if (menuChoice == 0 && x >= 90 && x <= 170 && y >= 550 && y <= 575)
                     Platform.exit();
               }
            });
      stage.show();
      
   }
   
   
   //Main method
   public static void main (String [] args)
   {
      launch (args);
   }
   
}