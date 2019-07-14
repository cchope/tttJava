package sample;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

import java.awt.*;


public class Controller {

    Rectangle startButton = new Rectangle(300, 150, 40,20);
    //startButton.setFill(Color.Green);

    EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent e) {
            System.out.println("Hello World");
          //  circle.setFill(Color.DARKSLATEBLUE);
        }
    };







}
