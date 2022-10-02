package ObserverPatterns.Vacancy;

public class JobSearch {
    public void main(String[] args){
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();

        jobSite.addVacancy("First Java Position");
        jobSite.addVacancy("Junior java developer");
        jobSite.addVacancy("Senior python developer");

        Observer firstSubscriber = new Subscriber("Jamie Land");
        Observer secondSubscriber = new Subscriber("Alex Problem");
        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);
        jobSite.removeVacancy("First Java Position");
        jobSite.addVacancy("Java middle developer");
        jobSite.removeObserver(firstSubscriber);
    }
}
