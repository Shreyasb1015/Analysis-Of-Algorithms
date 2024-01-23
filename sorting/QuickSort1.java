import java.util.Arrays;

public class QuickSort1 {

    public static void main(String args[]){

        int[] arr= {5,4,3,2,1};
        System.out.println("Before Sorting: "+Arrays.toString(arr));
        quickSort(arr,0,arr.length-1);
        System.out.println("After Sorting: "+Arrays.toString(arr));

    }

    public static int partition(int[] arr,int low,int high){

        int pivot=arr[low];
        int i=low,j=high;

        while(i <j ){

            while(arr[i] <=pivot && i<high){
                i++;
            }
            while(arr[j] >pivot && j>low){
                j--;
            }
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }


        }
        int temp=arr[low];
        arr[low]=arr[j];
        arr[j]=temp;

        return j;
    }

    public static void quickSort(int[] arr,int low,int high){

        if(low < high){
            int j=partition(arr,low,high);
            quickSort(arr,low,j-1);
            quickSort(arr,j+1,high);
        }

    }
    
}
