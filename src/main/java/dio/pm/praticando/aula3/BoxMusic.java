package main.java.dio.pm.praticando.aula3;

public class BoxMusic implements MusicPlayer{

    @Override
    public void playMusic() {
        System.out.println("A caixa de música está reproduzindo a música");
    }

    @Override
    public void pauseMusic() {
        System.out.println("A caixa de música está pausando a música");
    }

    @Override
    public void stopMusic() {
        System.out.println("A caixa de música está parando a música");
    }

}
