import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class FlutTestMainUpdate {

    public static void main(String[] args) {
//        long startTime = System.nanoTime();

        ArrayList<int[]> piles = new ArrayList<int[]>();
//        int pile[] = {6,12,3,10,7,16,5};
        int pile1[] = {5, 7, 3, 11, 9, 10};
        int pile2[] = {9, 1, 2, 3, 4, 10, 16, 10, 4, 16};
//        int pile3[] = {9, 1, 2, 3, 4, 10, 16, 10, 4, 16};
//        piles.add(pile);
        piles.add(pile1);
        piles.add(pile2);
//        piles.add(pile3);
        int schuur = piles.size();
        ArrayList<Integer> combinedarray = FlutAlgorithm.mergingPilesexceptfirstOne(piles);
        System.out.println();
        if (schuur > 0) {
            int maxKey = 0;
            HashMap<Integer, ArrayList<Integer>> profitsTableMap = FlutAlgorithmUpdate.maxProfit(combinedarray);
            ArrayList<Integer> profitIndex = new ArrayList<Integer>();
            for (int key : profitsTableMap.keySet()) {
                if (key > maxKey)
                    maxKey = key;
            }
            System.out.println("\nschuurs " + schuur);
            System.out.println("Maximum profit is: " + maxKey + ".");
            System.out.print("Number of fluts to buy: ");
            profitIndex = profitsTableMap.get(maxKey);
            for (int j = 0; j < profitIndex.size(); j++) {
                System.out.print(profitIndex.get(j) + " ");
            }
        }

//        System.out.println();
//        long endTime = System.nanoTime();
//        long totalTime = endTime - startTime;
//        System.out.println(totalTime);
    }
}
