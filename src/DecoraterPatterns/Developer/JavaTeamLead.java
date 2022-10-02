package DecoraterPatterns.Developer;



public class JavaTeamLead extends DeveloperDecorator {
    public JavaTeamLead(Developer developer) {
        super(developer);
    }
    public String sendWeekReport(){
        return "Send week report to costumer.";
    }

    @Override
    public String makeJob() {
        return super.makeJob()+ sendWeekReport();
    }
}
