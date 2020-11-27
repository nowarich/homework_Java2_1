package ru.geekbains.DZ;

public class Team {
//    public String participant1;
    private String name;

    public String participant1, participant2, participant3, participant4;

    public Team(String name, String participant1, String participant2, String participant3, String participant4){
        this.name = name;
        this.participant1 = participant1;
        this.participant2 = participant2;
        this.participant3 = participant3;
        this.participant4 = participant4;
    }


    public void getNames() {
//            System.out.println(participant1 + ", "+ participant2 + ", " + participant3 + ", " + participant4);

    String[] teammates = {participant1,participant2,participant3,participant4};

        for (String i : teammates) {
            System.out.println(i);
        }

    }

    public void showResults() {
        String results = Course.getResults();
        System.out.println("And at long last... " + results);
    }

}
