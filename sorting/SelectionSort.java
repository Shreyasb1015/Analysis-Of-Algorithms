import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args)
    {
        int[] arr={5,4,3,2,1};
        System.out.println("Before Sorting: "+Arrays.toString(arr));
        selectionsort(arr);
        System.out.println("After Sorting: "+Arrays.toString(arr));
        
    }

    public static void selectionsort(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int min=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[min])
                {
                    min=j;
                }
            }
            if(min !=i)
            {
                int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }

        }

    }

    
    
}
