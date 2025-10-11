
import java.util.*;

public class fizz_buzz {
    public static void main(String[] args){
        System.out.print("Number: ");
        Scanner sc = new Scanner(System.in);
        int Number = sc.nextInt();
        if (Number%5 == 0 && Number%3==0)
            System.out.println("Fizz Buzz");
        else if (Number%5 == 0)
            System.out.println("Fizz");
        else if (Number%3 == 0)
            System.out.println("Buzz");
        else 
            System.out.println(Number);
    }
}
