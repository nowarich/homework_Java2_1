package ru.geekbains.DZ;

import java.util.Random;

public class Course {
    private String test1;
    private String test2;
    public static String results;

    public Course(String test1, String test2) {
        this.test1 = test1;
        this.test2 = test2;
    }


    public static String getResults() {
        return results;
    }

    public String doIt(Team team) {

        String[] challenges = {test1, test2};
//        System.out.println("has passed"+challenges[1]);
        String[] teammates = new String[]{
                team.participant1,  // пришлось делать participant1+ public
                team.participant2,
                team.participant3,
                team.participant4
        };
        results = "Results:\n";

        Random random = new Random();
        for (String i : challenges) {

            for (String j : teammates) {
                int dice = random.nextInt(2);

                if (dice == 1) {
                    results += j + " has passed " + i + "\n";
                } else {
                    results += j + " has failed " + i + "\n";
                }
            }
        }
        return results;

    }


}
