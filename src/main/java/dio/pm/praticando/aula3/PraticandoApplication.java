package main.java.dio.pm.praticando.aula3;

import javax.swing.*;

public class PraticandoApplication {

	public static void main(String[] args) {

		Computer computer = new Computer();
		playMusic(computer);
		playVideo(computer);
		BoxMusic boxMusic = new BoxMusic();
		playMusic(boxMusic);

	}

	static void playMusic(MusicPlayer musicPlayer){
		musicPlayer.playMusic();
	}

	static void playVideo(VideoPlayer videoPlayer){
		videoPlayer.playVideo();
	}

}
