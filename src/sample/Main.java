package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.text.Text;

//import javax.xml.soap.Text;
import java.awt.*;

/* todo:
create/mapout "scenes"
create buttons for game squares and starting buttons
display board, display game pieces when played
connect visuals to backend


*/

public class Main extends Application {

    Scene startScene, configureGame, gameScene, endScene;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hi Papa!");
        Scene scene = new Scene(root, 500, 500);
        scene.setFill(Color.PURPLE);
        Text welcome = new Text();
        welcome.setFont(new Font(50));
        welcome.setX(150);
        welcome.setY(100);
        welcome.setText("Welcome to the game of Tic Tac Toe");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    /*
    Scene 1: Opening Scene- TIC TAC TOE (text) with Start button
    Scene 2: Players enter their names, choose which symbol they want to play with,
    Scene 3: Displays the game board, players moves are displayed on top of board presents who's turn it is, button for end game or start again
    Scene 4: Winning or tie screen
*/

    //scene 3
    public static void drawBoard() {
//        Text welcome = new Text();
//        welcome.setFont(new Font(50));
//        welcome.setX(150);
//        welcome.setY(100);
//        welcome.setText("Welcome to the game of Tic Tac Toe");

        Text pickGameType = new Text();
        pickGameType.setFont(new Font(50));
        pickGameType.setX(150);
        pickGameType.setY(200);
        pickGameType.setText("Please enter the row and column number that you would like to play");
        //later version, player can click on button on game board (make all game squares buttons)

        //at beginning of game when drawing the board
        for(int i=0; i<3; i++) {
            for(int j=0;j<3; j++) {
                //draw 9 boardSquares
                Rectangle boardSquare = new Rectangle(200+(200*i), 100+(100*j), 100, 100);
                //set outlind of black for each boardsquare
                //boardSquare.setOutline()
            }
        }
    }


    //during turn, depending on what symbol of player
    public void drawSymbols() {
        Text x = new Text();
        x.setFont(new Font(80));
        x.setText("X");

        Text o = new Text();
        o.setFont(new Font(80));
        o.setText("O");
    }





    public static void main(String[] args) {
        launch(args);
    }
}
