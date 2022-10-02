package DecoraterPatterns.Village;

public class TaskVillage {
    public static void main(String[] args) {
        Village village = new VillageInhabits(new VillagePolice( new VillageMayor()));
        System.out.println(village.numOfInhabit());
    }
}
