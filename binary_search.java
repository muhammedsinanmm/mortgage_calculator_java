public class binary_search {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        int target = 60;
        System.out.println(binarySearch(arr, target));
    }
    static int binarySearch(int[] arr, int target){
        int i = 0;
        int j = arr.length - 1;
        while (i <= j){
            int mid = (i+j)/2;
            if (arr[mid] == target){
                return mid;
            }
            if(arr[mid]>target){
                j = mid-1;
                
            }
            else{
                i = mid+1;
            }
        }
        return -1;
    }
}
