
import java.util.Arrays;

class BubbleSort{

    public static void main(String[] args)
    {
        int[] arr={5,4,3,2,1};
        System.out.println("Before Sorting: "+Arrays.toString(arr));
        bubblesort(arr);
        System.out.println("After Sorting: "+Arrays.toString(arr));

    }

    public static void bubblesort(int[] arr)
    {
        for(int i=arr.length-1;i>=0;i--)
        {
            for(int j=0;j<i;j++)
            {
                if(arr[j] >arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}