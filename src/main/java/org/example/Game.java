package org.example;

import java.util.SplittableRandom;
import java.util.concurrent.ThreadLocalRandom;

public class Game {
    private final String[] doors = new String[3];
    private int choice;
    public Game() {
        // random setting of goats and car behind the doors
        int randomNum = ThreadLocalRandom.current()
                .nextInt(0, 2);
        for (int i = 0; i < this.doors.length; i++) {
            if (randomNum != i) {
                this.doors[i] = "goat";
            } else {
                this.doors[i] = "car";
            }
        }
            // random choice of a door from the doors
            // to save code work omitting the procedure
            // of speculation with remaking the choice
            SplittableRandom random = new SplittableRandom();
            this.choice = random.nextInt(0, 3);
    }
//
    public boolean gameResult(){
        return doors[this.choice].equals("car");
    }

    @Override
    public String toString() {
        return "Door#1 - " + doors[0] + "  " +
                "Door#2 - " + doors[1] + "  " +
                "Door#3 - " + doors[2];

    }

}
