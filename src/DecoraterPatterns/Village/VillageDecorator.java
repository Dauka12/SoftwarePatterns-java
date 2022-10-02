package DecoraterPatterns.Village;

public class VillageDecorator implements Village {
    Village village;

    public VillageDecorator(Village village) {
        this.village = village;
    }

    @Override
    public String numOfInhabit() {
        return village.numOfInhabit();
    }
}
