package ObserverPatterns.YouTube;



public class YouTubeNotifications {
    public static void main(String[] args){
        YouTubeVideos youTubeVideos = new YouTubeVideos();

        youTubeVideos.addVideo("Some video");
        youTubeVideos.addVideo("A4 video");
        youTubeVideos.addVideo("Robert video");

        Observer oneSubscriber = new Subscriber("Claim Play");
        Observer twoSubscriber = new Subscriber("Alex no Problem");
        youTubeVideos.addObserver(oneSubscriber);
        youTubeVideos.addObserver(twoSubscriber);
        youTubeVideos.removeVideo("Jamie video");
        youTubeVideos.addVideo("Cult Anime video");
        youTubeVideos.removeObserver(oneSubscriber);
        youTubeVideos.addVideo("Alex video");
    }

}
