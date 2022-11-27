public class TeamLeaf implements TeamComponent {
    String name;
    int athletes, goldMedals;

    public TeamLeaf(String name, int athletes, int goldMedals) {
        this.name = name;
        this.athletes = athletes;
        this.goldMedals = goldMedals;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void getAthletes() {
        System.out.println(getName());
        System.out.println("Athletes: " + athletes);
    }

    @Override
    public void getGoldMedals() {
        System.out.println(getName());
        System.out.println("Gold Medals: " + goldMedals);
    }
}
