import java.util.*;

public class FlutAlgorithm {
    static int sellingprice = 10;

//    public int lengthOfMergedPiles(ArrayList<int[]> piles) {
//        int length = 0;
//        for (int i = 0; i < piles.size(); i++) {
//            length += piles.get(i).length - 1;
//        }
//        return length;
//    }

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

    static ArrayList<Integer> maxProfit(ArrayList<Integer> piles) {
        ArrayList<Integer> profitsTable = new ArrayList<Integer>();
        int profit = 0;
        for (int i = 0; i < piles.size(); i++) {
            profit += (sellingprice - piles.get(i));
            profitsTable.add(profit);
//           System.out.print(profitsTable.get(i) + " ");
        }
        return profitsTable;
    }

    static void numOfFluts(int maximumProfit, ArrayList<Integer> profitArray) {
        ArrayList<Integer> maxProfitInProfitArray = new ArrayList<Integer>();
        for (int i = 0; i < profitArray.size(); i++) {
            if (profitArray.get(i) == maximumProfit) {
                System.out.print((i + 1) + " ");
            }
        }
    }
}
