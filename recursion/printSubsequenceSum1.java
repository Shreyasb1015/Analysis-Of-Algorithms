import java.util.ArrayList;

public class printSubsequenceSum1 {

    
    public static void main(String[] args) {
            int [] arr= {1,2,1};

            //Aim: Print all the subsequences whose sum is 2.
            ArrayList<Integer> list = new ArrayList<>();
            printifSum(0,arr,list,0);
            
    }

    public static void printifSum(int index,int[] arr,ArrayList<Integer> list,int sum)
    {
        if(index >=arr.length)
        {
            if(sum==2)
            {
                System.out.println(list);
            }
            return;
        }
        
            list.add(arr[index]);
            sum=sum+arr[index];
            printifSum(index+1,arr,list,sum);
            list.remove(list.size()-1);
            sum=sum-arr[index];
            printifSum(index+1,arr,list,sum);
        
    }
    
}
