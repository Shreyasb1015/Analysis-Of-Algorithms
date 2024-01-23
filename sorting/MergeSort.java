import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args){
            
            int[] arr={5,4,3,2,1};
            System.out.println("Before Sorting: "+Arrays.toString(arr));
            mergeSort(arr,0,arr.length-1);
            System.out.println("After Sorting: "+Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr,int low,int high){

        if(low < high){
            int mid=(low+high)/2;
            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }

    }
    public static void merge(int[] arr,int low,int mid,int high){

        int[] temp=new int[high-low+1];
        int i=low,j=mid+1,k=0;

        while(i<=mid && j<=high){

            if(arr[i] <= arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }

        while(i<=mid){
            temp[k]=arr[i];
            i++;
            k++;
        }

        while(j<=high){
            temp[k]=arr[j];
            j++;
            k++;
        }

        for(int x=low;x<=high;x++){
            arr[x]=temp[x-low];
        }

    }
    
}
