import java.util.*;
import java.math.*;
import java.text.NumberFormat;

class Mortgage_calc{
    public static void main(String[] args){
        System.out.print("Principle Amount: ");
        Scanner sc = new Scanner(System.in);
        int principle = sc.nextInt();
        System.out.print("Intrest Rate: ");
        float rate = sc.nextFloat();
        rate = rate/1200;
        System.out.print("Time period in years: ");
        int n = sc.nextInt();
        n = n*12;
        double mortgage = principle * (rate * Math.pow(1 + rate, n) / (Math.pow(1 + rate, n) - 1));
        System.out.println(NumberFormat.getCurrencyInstance().format(mortgage));
    }
}