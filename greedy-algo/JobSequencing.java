

import java.util.*;

public class JobSequencing {
   
   
    char id;
    int deadline, profit;
 
    // Constructors
    public JobSequencing() {}
 
    public JobSequencing(char id, int deadline, int profit)
    {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
 
    
    void printJobScheduling(ArrayList<JobSequencing> arr, int t)
    {
        
        int n = arr.size();
       
        
        Collections.sort(arr,
                         (a, b) -> b.profit - a.profit);
 
      
        boolean result[] = new boolean[t];
 
        
        char job[] = new char[t];
 
        
        for (int i = 0; i < n; i++) {
            
            for (int j = Math.min(t - 1, arr.get(i).deadline - 1); j >= 0; j--) {
                
                if (result[j] == false) {
                    result[j] = true;
                    job[j] = arr.get(i).id;
                    break;
                }
            }
        }
 
        
        for (char jb : job)
            System.out.print(jb + " ");
        System.out.println();
    }
 
    
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<JobSequencing> arr = new ArrayList<JobSequencing>();

        System.out.print("Enter the number of processes: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter process name for job " + (i + 1) + ": ");
            char id = scanner.next().charAt(0);

            System.out.print("Enter deadline for job " + (i + 1) + ": ");
            int deadline = scanner.nextInt();

            System.out.print("Enter profit for job " + (i + 1) + ": ");
            int profit = scanner.nextInt();

            arr.add(new JobSequencing(id, deadline, profit));
        }

        System.out.println("Following is the maximum profit sequence of jobs -->");

        JobSequencing job = new JobSequencing();

        
        job.printJobScheduling(arr, n);
        scanner.close();
    }
}

