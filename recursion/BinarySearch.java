class BinarySearch{

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int index=binarySearch(arr, 0, arr.length-1, 6);
        if(index!=-1){
            System.out.println("Element found at index: "+index);
        }
        else{
            System.out.println("Element not found");
        }
    }

    public static int binarySearch(int[] arr, int low, int high, int key){
        if(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]>key){
                return binarySearch(arr, low, mid-1, key);
            }
            else{
                return binarySearch(arr, mid+1, high, key);
            }
        }
        return -1;
    }
}