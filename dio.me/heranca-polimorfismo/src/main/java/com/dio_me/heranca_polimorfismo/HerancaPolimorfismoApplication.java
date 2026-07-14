package com.dio_me.heranca_polimorfismo;

public class HerancaPolimorfismoApplication {

	public static void main(String[] args) {
		Computer computer = new Computer();
		var musicBox = new MusicBox();

		playMusic(computer);
		playVideo(computer);

		playMusic(musicBox);
	}

	private static void playMusic(MusicPlayer musicPlayer){
		musicPlayer.playMusic();
	}

	private static void playVideo(VideoPlayer videoPlayer){
		videoPlayer.playVideo();
	}

}
