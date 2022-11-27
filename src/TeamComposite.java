import java.util.ArrayList;
import java.util.List;

public class TeamComposite implements TeamComponent {
    String name;
    List<TeamComponent> teamComponents = new ArrayList<>();

    public TeamComposite(String name) {
        this.name = name;
    }

    public void addTeamComponent(TeamComponent comp) {
        teamComponents.add(comp);
    }

    public String getName() {
        return name;
    }

    public void getAthletes() {
        System.out.println(getName());
        for(TeamComponent c : teamComponents) {
            c.getAthletes();
        }
    }

    public void getGoldMedals() {
        System.out.println(getName());
        for(TeamComponent c : teamComponents) {
            c.getGoldMedals();
        }
    }
}
