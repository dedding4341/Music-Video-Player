package view;

import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import view.PlayNext;
import javafx.scene.control.Button;


public class MainScreen extends Application{
    //This class will setup the initial UI interface for my application
    private Scene blankScene;
    private Stage primaryStage;

    //Set some initial menus
    private PlayNext playThis = new PlayNext();
    private CurrentlyPlaying playing = new CurrentlyPlaying();



    //Launch my application
    public static void startApplication() {
        launch();
    }

    public void start(Stage primaryStage) {
        primaryStage.setTitle("Dennis's Personal Music Player");

        //Set up window~
        BorderPane blankWindow = new BorderPane();
        HBox playNext = new HBox(playThis.getRootNode());
        HBox appContent = new HBox(playing.getRootNode());


        appContent.setMaxWidth(560);
        appContent.setMaxHeight(350); // Allow a little black space for youtube symbols to fade
        //Center "Play This" button
        blankWindow.setBottom(playNext);
        playNext.setAlignment(Pos.CENTER);
        //Center Content Window
        blankWindow.setCenter(appContent);
        appContent.setAlignment(Pos.CENTER);

        //Set windows size
        blankWindow.setPrefSize(1000,1000);




        //Setting up the visual
        blankScene = new Scene(blankWindow);
        primaryStage.setScene(blankScene);
        primaryStage.show();
    }

/*    public static CurrentlyPlaying getCurrentlyPlaying() {
        return playing;

    }*/

}