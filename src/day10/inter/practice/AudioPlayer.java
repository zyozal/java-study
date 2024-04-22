package day10.inter.practice;

public class AudioPlayer implements MediaPlayable{
    @Override
    public void play() {
        System.out.println("오디오 재생");
    }

    @Override
    public void pause() {
        System.out.println("오디오 일시정지");

    }

    @Override
    public void stop() {
        System.out.println("오디오 정지");
    }
}
