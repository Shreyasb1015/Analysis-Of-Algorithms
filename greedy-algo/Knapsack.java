import java.util.Scanner;

public class Knapsack {

    static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    static int knapSack(int W, int wt[], int val[], int n) {
        if (n == 0 || W == 0)
            return 0;
        if (wt[n - 1] > W)
            return knapSack(W, wt, val, n - 1);
        else
            return max(val[n - 1] + knapSack(W - wt[n - 1], wt, val, n - 1), knapSack(W, wt, val, n - 1));
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the number of items
        System.out.println("Enter the number of items:");
        int n = scanner.nextInt();

        int profit[] = new int[n];
        int weight[] = new int[n];

        // Take profits input from the user
        System.out.println("Enter profits for each item:");
        for (int i = 0; i < n; i++) {
            profit[i] = scanner.nextInt();
        }

        // Take weights input from the user
        System.out.println("Enter weights for each item:");
        for (int i = 0; i < n; i++) {
            weight[i] = scanner.nextInt();
        }

        // Take knapsack capacity from the user
        System.out.println("Enter the capacity of the knapsack:");
        int W = scanner.nextInt();

        // Compute and print the maximum profit
        System.out.println("Maximum profit: " + knapSack(W, weight, profit, n));
        
        scanner.close();
    }
}

    