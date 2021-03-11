import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class FlutAlgorithmUpdate {
    static int sellingprice = 10;

    static ArrayList<Integer> mergingPilesexceptfirstOne(ArrayList<int[]> piles) {
        ArrayList<Integer> mergedPile = new ArrayList<Integer>();
        for (int i = 0; i < piles.size(); i++) {
            int temp = 1;
            for (int j = temp; j < piles.get(i).length; j++) {
                mergedPile.add(piles.get(i)[j]);
            }
        }
        return mergedPile;
    }

    static HashMap<Integer, ArrayList<Integer>> maxProfit(ArrayList<Integer> piles) {
        HashMap<Integer, ArrayList<Integer>> profitsTableMap = new HashMap<Integer, ArrayList<Integer>>();
        ArrayList<Integer> profitIndex = new ArrayList<Integer>();
        int profit = 0;
        int index = 0;
        for (int i = 0; i < piles.size(); i++) {
            profit += (sellingprice - piles.get(i));
            index = i + 1;
            if (profitsTableMap.containsKey(profit)) {
                profitIndex = profitsTableMap.get(profit);
                profitIndex.add(index);
                profitsTableMap.put(profit, profitIndex);
            } else {
                ArrayList<Integer> profitIndex1 = new ArrayList<Integer>();
                profitIndex1.add(index);
                profitsTableMap.put(profit, profitIndex1);
            }
        }
        return profitsTableMap;
    }
}
