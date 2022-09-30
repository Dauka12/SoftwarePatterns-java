package StrategyPatterns.Child;

public class Sleeping implements Activity{
    @Override
    public void doIt() {
        System.out.println("Sleeping...");
    }
}
