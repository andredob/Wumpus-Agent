package com.facamp.com747.wumpus.agent;

public class TestAgent {

    public TestAgent() {
    }

    public static void main(String[] args) {
        int n = 1;
        double sumOfPoints = 0;
        double numberOfWins = 0;
        CaveView caveView = new CaveView();
        for (int i = 0; i < n; i++) {
            caveView.setIteraction(i);

            //Agent a = new Agent(System.currentTimeMillis());
            Agent a = new Agent(1);
            caveView.setAgent(a);
            a.setAgentStateChangeListener(caveView);

            Cave cave = new Cave();
            caveView.setCave(cave);
            cave.setListener(caveView);
            a.setCave(cave);

            a.run();

            if (a.win) {
                numberOfWins = numberOfWins + 1;
            }
            
            sumOfPoints += a.points;

            caveView.setWins(numberOfWins / (i + 1.0) * 100.0);
            caveView.setPoints(sumOfPoints / (double)(i+1));
        }

        System.out.printf("Wins: %4.2f%% %n", numberOfWins / n * 100.0);
        System.out.printf("Average points: %4.2f%% %n", sumOfPoints / numberOfWins);
    }

}
