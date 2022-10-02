package DecoraterPatterns.Village;

public class VillagePolice extends VillageDecorator{
    public VillagePolice(Village village) {
        super(village);
    }

    public String numOfCriminal() {
        return "Amount of 2 in month. ";

    }

    @Override
    public String numOfInhabit() {
        return super.numOfInhabit()+numOfCriminal();
    }
}
