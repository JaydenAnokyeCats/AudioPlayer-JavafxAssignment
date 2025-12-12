package com.example.audioplayer;

import javafx.fxml.FXML;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Text;

import java.io.File;

public class HelloController {
    @FXML
    private Text songTitle;
    @FXML
    private Text artistName;
    @FXML
    private MediaPlayer mediaPlayer;

    @FXML
    protected void onPlayButtonClick(){
        String path = "src/main/resources/audio/The Weeknd - The Hills (Lyrics).mp3";
        Media sound = new Media(new File(path).toURI().toString());
        mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
        int checker = 0;

        if (checker == 0){
            songTitle.setText("The Hills");
            artistName.setText("The Weeknd");
        } else if (checker == 1){
            songTitle.setText("On Bended Knee");
            artistName.setText("Boyz II Men");
        } else if (checker == 2) {
            songTitle.setText("Pipe Down (Clean)");
            artistName.setText("Young Thug (ft. Travis Scott)");
        }
    }

    @FXML
    protected void onPauseButtonClick() {

    }
}