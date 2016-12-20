package view;

import javafx.scene.web.WebView;
import javafx.scene.layout.HBox;

public class CurrentlyPlaying {
    private static HBox playing = new HBox();
    private static WebView webview = new WebView();

    public CurrentlyPlaying() {
        webview.setPrefSize(560, 315);
        playing.getChildren().add(webview);
    }

    public static void updatePlaying(String link) {
        webview.getEngine().load(link);

    }



    public HBox getRootNode() {
        return playing;
    }

}


