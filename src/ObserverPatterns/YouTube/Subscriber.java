package ObserverPatterns.YouTube;

import ObserverPatterns.YouTube.Observer;

import java.util.List;

public class Subscriber implements Observer {
    String name;
    public Subscriber(String name){
        this.name = name;
    }
    @Override
    public void handleEvent(List<String> videos) {
        System.out.println("Hello "+name+"\nThere is a new funny video; \n"+ videos + "\n----------------------------------------------\n");
    }
}
