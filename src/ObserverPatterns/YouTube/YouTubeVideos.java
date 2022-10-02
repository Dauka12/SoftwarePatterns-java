package ObserverPatterns.YouTube;

import java.util.ArrayList;
import java.util.List;

public class YouTubeVideos implements Observed {
    List<String> videos=new ArrayList<>();
    List<Observer> subscribers = new ArrayList<>();

    public void addVideo(String video) {
         this.videos.add(video);
         notifyObserver();
    }
    public void removeVideo(String video) {
        this.videos.remove(video);
    }


    @Override
    public void addObserver(Observer observer) {
        this.subscribers.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer: subscribers){
            observer.handleEvent(this.videos);
        }

    }
}
