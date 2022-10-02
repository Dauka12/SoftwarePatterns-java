package ObserverPatterns.Vacancy;

import java.lang.reflect.Constructor;
import java.util.List;

public class Subscriber implements Observer{
    String name;
    public Subscriber(String name){
        this.name = name;
    }
    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println("Dear "+name+"\nwe have some changes vacancies; \n"+ vacancies + "\n----------------------------------------------\n");

    }
}
