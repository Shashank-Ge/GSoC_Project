public class BinarySearch {
    public static int BinarySearch( int[] arr, int target){
        int low=0;
        int high=arr.length-1;
        while ( low<=high) {
            int mid=low + (high-low)/2;
            if ( arr[mid]==target) return mid;
            else if (arr[mid]<target){
                low=mid+1;
            }else {
                high=mid-1;
            }
        }
        return -1;

    }


    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int target=2;
        int result=BinarySearch(arr,target);

        if (result!=-1) {
            System.out.println("index: "+ result);
        }else {
            System.out.println("target not found");
        }
    }
}
