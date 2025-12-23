package com.example.audioplayer;

import javafx.fxml.FXML;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Text;

import java.io.File;
import java.util.LinkedHashMap;

public class HelloController {
    @FXML
    private Text songTitle;
    @FXML
    private Text artistName;
    private int checker;
    private String audPath = "src/main/resources/audio/";
    private MediaPlayer mediaPlayer;

    @FXML
    protected void onPlayButtonClick(){
        LinkedHashMap<String, String> songList = new LinkedHashMap<>();
        songList.put("The Weeknd - The Hills (Lyrics).mp3", "The Hills");
        songList.put("Boyz II Men - On Bended Knee (Lyrics).mp3", "On Bended Knee");
        songList.put("Young Thug - Pipe Down (feat. Travis Scott) (Best Clean Version).mp3", "Pipe Down (Clean)");
        songList.put("Lady Gaga - Judas (Lyrics).mp3", "Judas");
        songList.put("Tory Lanez - The Color Violet (Lyrics).mp3", "The Color Violet");
        songList.put("【フリーBGM】The Essence of Awakening【かっこいい・疾走感・戦闘】.mp3", "The Essence of Awakening");
        songList.put("Miley Cyrus - Wrecking Ball (Official Video).mp3", "Wrecking Ball");
        songList.put("Nos Astra's BGM CAMELLIA - LIGHT IT UP (nawkoir's cut).mp3", "LIGHT IT UP (nawkoir's cut)");
        songList.put("Pierce The Veil - Pass The Nirvana (Official Music Video).mp3", "Pass The Nirvana");
        songList.put("Tory Lanez - Time.mp3", "Time");

        



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
//        LinkedHashMap<String, String> songList = new LinkedHashMap<>();
//        songList.put("The Weeknd - The Hills (Lyrics).mp3", "The Hills");
//        songList.put("Boyz II Men - On Bended Knee (Lyrics).mp3", "On Bended Knee");
//        songList.put("Young Thug - Pipe Down (feat. Travis Scott) (Best Clean Version).mp3", "Pipe Down (Clean)");
//        songList.put("Lady Gaga - Judas (Lyrics).mp3", "Judas");
//        songList.put("Tory Lanez - The Color Violet (Lyrics).mp3", "The Color Violet");
//        songList.put("【フリーBGM】The Essence of Awakening【かっこいい・疾走感・戦闘】.mp3", "The Essence of Awakening");
//        songList.put("Miley Cyrus - Wrecking Ball (Official Video).mp3", "Wrecking Ball");
//        songList.put("Nos Astra's BGM CAMELLIA - LIGHT IT UP (nawkoir's cut).mp3", "LIGHT IT UP (nawkoir's cut)");
//        songList.put("Pierce The Veil - Pass The Nirvana (Official Music Video).mp3", "Pass The Nirvana");
//        songList.put("Tory Lanez - Time.mp3", "Time");




    }
}