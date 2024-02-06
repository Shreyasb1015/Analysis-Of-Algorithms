import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Knapsack {

    
    private static double getMaxValue(int[] profits, int[] weights, int capacity) {
        
        double[] ratios = new double[profits.length];
        for (int i = 0; i < profits.length; i++) {
            ratios[i] = (double) profits[i] / weights[i];
        }
  
        int n = profits.length;
        Integer[] indexes = new Integer[n];
        for (int i = 0; i < n; i++) {
            indexes[i] = i;
        }
        Arrays.sort(indexes, Comparator.comparingDouble(i -> -ratios[i]));

        double totalValue = 0d;

        for (int index : indexes) {
            int curWt = weights[index];
            int curVal = profits[index];

            if (capacity - curWt >= 0) {
                
                capacity -= curWt;
                totalValue += curVal;
            } else {
                
                double fraction = (double) capacity / curWt;
                totalValue += curVal * fraction;
                capacity -= (curWt * fraction);
                break;
            }
        }

        return totalValue;
    }

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of items:");
        int n = scanner.nextInt();
        int[] profits = new int[n];
        int[] weights = new int[n];

        System.out.println("Enter profits for each item:");
        for (int i = 0; i < n; i++) {
            profits[i] = scanner.nextInt();
        }

        System.out.println("Enter weights for each item:");
        for (int i = 0; i < n; i++) {
            weights[i] = scanner.nextInt();
        }

        System.out.println("Enter the capacity of the knapsack:");
        int capacity = scanner.nextInt();

        double maxValue = getMaxValue(profits, weights, capacity);

        System.out.println("Maximum value: " + maxValue);

        scanner.close();
    }
}
