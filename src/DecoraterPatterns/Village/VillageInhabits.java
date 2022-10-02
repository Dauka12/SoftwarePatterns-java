package DecoraterPatterns.Village;

public class VillageInhabits extends VillageDecorator{
    public VillageInhabits(Village village) {
        super(village);
    }

    public String mayorsPresentation() {
        return "Every 3th day of months would be mayors presentation in village hall. ";
    }

    @Override
    public String numOfInhabit() {
        return super.numOfInhabit()+mayorsPresentation();
    }
}
