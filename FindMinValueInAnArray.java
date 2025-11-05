import java.util.Scanner;

public class FindMinValueInAnArray {
    public static void main(String[] args){
        int[] arr = new int[10] ;
        // Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array: ");
        for (int i=0; i<10;i++){
            arr[i] = sc.nextInt();
        }
        
        int minNumber = minVal(arr);
        if (minNumber == Integer.MIN_VALUE){
            System.out.println("The array is empty !");
        
        }
        else{
            System.out.println("The minimum number in the array is " + minNumber);
        }
    }
    static int minVal(int[] arr){
        if (arr.length == 0){
            return Integer.MIN_VALUE;
        }
        int min = arr[0];
        for (int num : arr){
            if (num < min){
                min = num;
            }
        }
        return min;
    }
}
