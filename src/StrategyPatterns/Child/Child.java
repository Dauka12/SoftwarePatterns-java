package StrategyPatterns.Child;

public class Child {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }
    public void executeActivity(){
        activity.doIt();
    };
}
