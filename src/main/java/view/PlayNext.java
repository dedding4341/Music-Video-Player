package view;

import javafx.scene.layout.HBox;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import controller.MusicController;



public class PlayNext {
    //Textfield currently only takes embed link... Looking for a way to resolve this.
    private TextField enterSong = new TextField("Enter your video here!");
    private Button playThis = new Button("Play This");
    private HBox playNextMenu = new HBox();
    private String link;

    public PlayNext() {
        //Construct playNext section of Border Pane

        enterSong.setPrefWidth(300);
        playNextMenu.getChildren().addAll(enterSong, playThis);

        playThis.setOnMousePressed(e -> {
            link = enterSong.getCharacters().toString();
            link = link.replace("watch?v=", "embed/");
            view.CurrentlyPlaying.updatePlaying(link);

        });

    }

    //Return the node
    public HBox getRootNode() {

        return playNextMenu;
    }

    public String getLink() {
        return link;
    }
}