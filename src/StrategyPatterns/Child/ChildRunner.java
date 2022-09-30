package StrategyPatterns.Child;

public class ChildRunner {
    public static void main(String[] args){
        Child child = new Child();
        child.setActivity(new Sleeping());
        child.executeActivity();

        child.setActivity(new Crying());
        child.executeActivity();

        child.setActivity(new Playing());
        child.executeActivity();
    }
}
