package HomeWorks.hw_9_part2;

/***2) Реализовать паттерн Адаптер для класса VideoPlayer с методом
 * playAvi() и интерфейса MediaPlayer с методом play()
 * - по аналогии с реализацией, показаной на занятии, в отдельном пакете (package)
 */
public class Main {
    public static void main(String[] args) {
        VideoPlayer videoPlayer = new VideoPlayer();
        VideoAdapter videoAdapter = new VideoAdapter(videoPlayer);

        videoAdapter.play();
    }
}
