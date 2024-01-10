import java.util.ArrayList;


// This is the better way for printing subsequences tha  part1 as it is more efficient and takes less time.
public class   subsequence2 {
    public static void main(String[] args) {

        int[] arr = { 3, 1, 2 };
        ArrayList<Integer> list = new ArrayList<>();
        printSub(0, arr, list);

    }

    public static void printSub(int index,int[] arr,ArrayList<Integer> list)
    {
        if(index >=arr.length)
        {
            System.out.println(list);
            return;
        }
        
            list.add(arr[index]);
            printSub(index+1,arr,list);
            list.remove(list.size()-1);
            printSub(index+1,arr,list);
        
    }
}

