package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Erstellen von Instanzen der Playable-Objekte
        MusicPlayer musicPlayer = new MusicPlayer();
        musicPlayer.play(); // Das Lied abspielen

        VideoPlayer videoPlayer = new VideoPlayer();
        videoPlayer.play();// Das Video abspielen

        System.out.println("\n********");

        // Erstellen eines MediaController-Objekts
        MediaController controller = new MediaController();
        // Abspielen von Musik und Video

        System.out.println("Medien abspielen:");
        controller.playMedia(musicPlayer); // Spielt das Lied ab
        controller.playMedia(videoPlayer); // Spielt das Video ab


    }
}