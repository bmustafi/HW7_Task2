public class Client {
    public static void main(String[] args) {
        // leaf-objects
        TeamLeaf taekwondo = new TeamLeaf("Taekwondo",1, 2);
        TeamLeaf waterpolo = new TeamLeaf("Waterpolo",3, 4);
        TeamLeaf gymnastics = new TeamLeaf("Artistic Gymnastics",5, 6);
        TeamLeaf shooting = new TeamLeaf("Shooting",7, 8);
        TeamLeaf cycling = new TeamLeaf("Cycling",9, 10);
        TeamLeaf tennis = new TeamLeaf("Tennis",11, 12);
        TeamLeaf tableTennis = new TeamLeaf("Table Tennis",13, 14);
        TeamLeaf football1 = new TeamLeaf("Football",15, 16);
        TeamLeaf alpineSky = new TeamLeaf("Alpine Sky",17, 18);
        TeamLeaf football2 = new TeamLeaf("Football",19, 20);
        TeamLeaf swimming = new TeamLeaf("Swimming Team",21, 22);
        TeamLeaf southAmerica = new TeamLeaf("South America Team", 23, 24);
        TeamLeaf afghanistan = new TeamLeaf("Afghanistan Team", 25, 26);
        TeamLeaf africa = new TeamLeaf("Africa Team", 27, 28);

        // composite-objects
        TeamComposite women1 = new TeamComposite("Women's Team");
        TeamComposite men1 = new TeamComposite("Men's Team");
        TeamComposite women2 = new TeamComposite("Women's Team");
        TeamComposite men2 = new TeamComposite("Men's Team");
        TeamComposite women3 = new TeamComposite("Women's Team");
        TeamComposite men3 = new TeamComposite("Men's Team");

        TeamComposite china = new TeamComposite("China Team");
        TeamComposite germany = new TeamComposite("Germany Team");
        TeamComposite italy = new TeamComposite("Italy Team");

        TeamComposite asia = new TeamComposite("Asia Team");
        TeamComposite europe = new TeamComposite("Europe Team");

        TeamComposite olympicsTeams = new TeamComposite("Olympics Teams");

        // build tree-structure
        women1.addTeamComponent(taekwondo);
        women1.addTeamComponent(waterpolo);
        women1.addTeamComponent(gymnastics);
        men1.addTeamComponent(shooting);
        women2.addTeamComponent(cycling);
        women2.addTeamComponent(tennis);
        men2.addTeamComponent(tableTennis);
        men2.addTeamComponent(football1);
        women3.addTeamComponent(alpineSky);
        men3.addTeamComponent(football2);
        men3.addTeamComponent(swimming);

        china.addTeamComponent(women1);
        china.addTeamComponent(men1);
        germany.addTeamComponent(women2);
        germany.addTeamComponent(men2);
        italy.addTeamComponent(women3);
        italy.addTeamComponent(men3);

        asia.addTeamComponent(china);
        asia.addTeamComponent(afghanistan);
        europe.addTeamComponent(germany);
        europe.addTeamComponent(italy);

        olympicsTeams.addTeamComponent(asia);
        olympicsTeams.addTeamComponent(africa);
        olympicsTeams.addTeamComponent(europe);
        olympicsTeams.addTeamComponent(southAmerica);

        // subtask 4
        System.out.println(germany.getName()); // a.
        men2.getAthletes();
        System.out.println("----------");

        germany.getGoldMedals(); // b.
        System.out.println("----------");

        asia.getGoldMedals(); // c.
        System.out.println("----------");

        olympicsTeams.getGoldMedals(); // d.

    }
}