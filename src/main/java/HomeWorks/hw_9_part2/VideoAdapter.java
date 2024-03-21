package HomeWorks.hw_9_part2;

public class VideoAdapter implements MediaPlayer{
    private VideoPlayer videoPlayer;


    public VideoAdapter(VideoPlayer videoPlayer) {
        this.videoPlayer = videoPlayer;
    }

    @Override
    public void play() {
        videoPlayer.playAvi();
    }
}
