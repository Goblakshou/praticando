package main.java.dio.pm.praticando.aula3;

public class Computer implements MusicPlayer, VideoPlayer {

    @Override
    public void playMusic() {
        System.out.println("O computador está reproduzindo a música");
    }

    @Override
    public void pauseMusic() {
        System.out.println("O computador está pausando a música");
    }

    @Override
    public void stopMusic() {
        System.out.println("O computador está parando a música");
    }

    @Override
    public void playVideo() {
        System.out.println("O computador está rodando o vídeo");
    }

    @Override
    public void pauseVideo() {
        System.out.println("O computador está pausando o vídeo");
    }

    @Override
    public void stopVideo() {
        System.out.println("O computador está parando o vídeo");
    }
}
