import java.util.ArrayList;
import java.util.Collections;

public class FlutTestMain {

    public static void main(String[] args) {
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

//       int sizeOfCombined = profitTest.lengthOfMergedPiles(piles);
//       System.out.println(sizeOfCombined);
        ArrayList<Integer> combinedarray = FlutAlgorithm.mergingPilesexceptfirstOne(piles);
//       for (int i = 0; i < sizeOfCombined; i++) {
//           System.out.print(combinedarray.get(i) + " ");
//      }
        System.out.println();
        if (schuur > 0) {
            ArrayList<Integer> profitArray = FlutAlgorithm.maxProfit(combinedarray);
            int maximumProfit = Collections.max(profitArray);
            System.out.println("\nschuurs " + schuur);
            System.out.println("Maximum profit is: " + Collections.max(profitArray) + ".");
            System.out.print("Number of fluts to buy: ");
            FlutAlgorithm.numOfFluts(maximumProfit, profitArray);
        }
    }
}
