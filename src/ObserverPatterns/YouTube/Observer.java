package ObserverPatterns.YouTube;

import java.util.List;

public interface Observer {
    void handleEvent(List<String> videos);
}
