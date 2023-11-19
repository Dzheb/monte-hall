package org.example;
// for the counting of percentage of frequencies of the game results
import org.apache.commons.math3.stat.Frequency;
import static org.apache.commons.math3.util.Precision.round;
import java.util.ArrayList;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        int n = 1000;// n = 100 games
        HashMap<Integer, Boolean> results = new HashMap<>();
        // accumulation of the results of the games
        for (int i = 0; i < n; i++) {
            boolean gameResult = new Game().gameResult();
            results.put(i, gameResult);
        }
//        analytics of the game results
        ArrayList<Boolean> listOfResults
                = new ArrayList<>(results.values());
        Frequency f = new Frequency();
        for (boolean el:listOfResults) {
            f.addValue(el);
        }
//        out
        System.out.println("Games results for 1000 cycles of the game: ");
        System.out.println("False results: "
                + round(f.getCumPct(false) * 100,2) + " per cent");
        System.out.println("True results: " +
                round((1-f.getCumPct(false)) * 100,2) + " per cent");
    }
}