package com.example.audioplayer;

import javafx.fxml.FXML;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Text;

import java.io.File;
import java.util.ArrayList;

public class HelloController {
    @FXML
    private Text songTitle;
    @FXML
    private Text artistName;
    private int checker = 0;
    private String audPath = "src/main/resources/audio/";
    private MediaPlayer mediaPlayer;

    @FXML
    protected void onPlayButtonClick(){
            listOfSongs(checker);
        

//        if (checker == 0){
//                String path = "src/main/resources/audio/The Weeknd - The Hills (Lyrics).mp3";
//                audioPlay(path);
//                songTitle.setText("The Hills");
//                artistName.setText("The Weeknd");
//                ++checker;
//            } else if (checker == 1){
//                mediaPlayer.stop();
//                String path = "src/main/resources/audio/Boyz II Men - On Bended Knee (Lyrics).mp3";
//                audioPlay(path);
//                songTitle.setText("On Bended Knee");
//                artistName.setText("Boyz II Men");
//                ++checker;
//            } else if (checker == 2) {
//                mediaPlayer.stop();
//                String path = "src/main/resources/audio/Young Thug - Pipe Down (feat. Travis Scott) (Best Clean Version).mp3";
//                audioPlay(path);
//                songTitle.setText("Pipe Down (Clean)");
//                artistName.setText("Young Thug (ft. Travis Scott)");
//                ++checker;
//            } else if (checker == 3 ){
//                mediaPlayer.stop();
//                String path = "src/main/resources/audio/Lady Gaga - Judas (Lyrics).mp3";
//                audioPlay(path);
//                songTitle.setText("Judas");
//                artistName.setText("Lady Gaga");
//                ++checker;
//            } else if (checker == 4 ){
//                mediaPlayer.stop();
//                String path = "src/main/resources/audio/Tory Lanez - The Color Violet (Lyrics).mp3";
//                audioPlay(path);
//                songTitle.setText("The Color Violet");
//                artistName.setText("Tory Lanez");
//                ++checker;
//            } else if (checker == 5 ){
//                mediaPlayer.stop();
//                String path = "src/main/resources/audio/【フリーBGM】The Essence of Awakening【かっこいい・疾走感・戦闘】.mp3";
//                audioPlay(path);
//                songTitle.setText("The Essence of Awakening");
//                artistName.setText("かっこいい・疾走感・戦闘");
//                ++checker;
//            } else if (checker == 6 ){
//                mediaPlayer.stop();
//                String path = "src/main/resources/audio/Miley Cyrus - Wrecking Ball (Official Video).mp3";
//                audioPlay(path);
//                songTitle.setText("The Essence of Awakening");
//                artistName.setText("かっこいい・疾走感・戦闘");
//                ++checker;
//            } else if (checker == 7 ){
//                mediaPlayer.stop();
//                String path = "src/main/resources/audio/Nos Astra's BGM CAMELLIA - LIGHT IT UP (nawkoir's cut).mp3";
//                audioPlay(path);
//                songTitle.setText("The Essence of Awakening");
//                artistName.setText("かっこいい・疾走感・戦闘");
//                ++checker;
//            } else if (checker == 8 ){
//                mediaPlayer.stop();
//                String path = "src/main/resources/audio/Pierce The Veil - Pass The Nirvana (Official Music Video).mp3";
//                audioPlay(path);
//                songTitle.setText("The Essence of Awakening");
//                artistName.setText("かっこいい・疾走感・戦闘");
//                ++checker;
//            } else if (checker == 9 ){
//                mediaPlayer.stop();
//                String path = "src/main/resources/audio/Tory Lanez - Time.mp3";
//                audioPlay(path);
//                songTitle.setText("The Essence of Awakening");
//                artistName.setText("かっこいい・疾走感・戦闘");
//                ++checker;
//            }  else if (checker == 10 ){
//                mediaPlayer.stop();
//                checker = 0;
//            }
    }

    // Pause Button
    @FXML
    protected void onPauseButtonClick(){
        mediaPlayer.pause();
    }
    @FXML
    protected void onUnpauseButtonClick(){
        mediaPlayer.play();
    }
    @FXML
    protected void audioPlay(String path) {
        Media sound = new Media(new File(path).toURI().toString());
        mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
    }

    @FXML
    protected void listOfSongs(int index){
        ArrayList<String> songList = new ArrayList<>();
        ArrayList<String> songNames = new ArrayList<>();
        ArrayList<String> artistNames = new ArrayList<>();

        songList.add("The Weeknd - The Hills (Lyrics).mp3");
        songNames.add("The Hills");
        artistNames.add("The Weeknd");

        songList.add("Boyz II Men - On Bended Knee (Lyrics).mp3");
        songNames.add("On Bended Knee");
        artistNames.add("Boyz II Men");

        songList.add("Young Thug - Pipe Down (feat. Travis Scott) (Best Clean Version).mp3");
        songNames.add("Pipe Down (Clean)");
        artistNames.add("Young Thug");

        songList.add("Lady Gaga - Judas (Lyrics).mp3");
        songNames.add("Judas");
        artistNames.add("Lady Gaga");

        songList.add("Tory Lanez - The Color Violet (Lyrics).mp3");
        songNames.add("The Color Violet");
        artistNames.add("Tory Lanez");

        songList.add("【フリーBGM】The Essence of Awakening【かっこいい・疾走感・戦闘】.mp3");
        songNames.add("The Essence of Awakening");
        artistNames.add("フリーBGM");

        songList.add("Miley Cyrus - Wrecking Ball (Official Video).mp3");
        songNames.add("Wrecking Ball");
        artistNames.add("Miley Cyrus");

        songList.add("Nos Astra's BGM CAMELLIA - LIGHT IT UP (nawkoir's cut).mp3");
        songNames.add("LIGHT IT UP (nawkoir's cut)");
        artistNames.add("CAMELLIA");

        songList.add("Pierce The Veil - Pass The Nirvana (Official Music Video).mp3");
        songNames.add("Pass The Nirvana");
        artistNames.add("Pierce The Veil");

        songList.add("Tory Lanez - Time.mp3");
        songNames.add("Time");
        artistNames.add("Tory Lanez");

        //use index parameter
        if (index >= 0 && index < songList.size()){
            songTitle.setText(String.valueOf (songNames.indexOf (songList.get(index) ) ) );
            artistName.setText(String.valueOf (artistNames.indexOf (songList.get(index))));
        }
    }
}