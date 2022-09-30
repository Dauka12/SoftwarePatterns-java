package StrategyPatterns.Student;

public class StudentRunner {
    public static void main(String[] args){
        Student student = new Student();
        student.setActivity(new Sleeping());
        student.executeActivity();

        student.setActivity(new Playing());
        student.executeActivity();

        student.setActivity(new Reading());
        student.executeActivity();

        student.setActivity(new Training());
        student.executeActivity();

        student.setActivity(new Sleeping());
        student.executeActivity();
    }
}
