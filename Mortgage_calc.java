import java.util.*;
import java.math.*;
import java.text.NumberFormat;

class Mortgage_calc{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,principle;
        float rate;
        while (true){
        System.out.print("Principle Amount: ");
        
        principle = sc.nextInt();
        if (principle >= 1000 && principle <= 10000000)
            break;
        else
            System.out.println("Enter a valid amount between 1k and 1M");}
        while (true){
        System.out.print("Intrest Rate: ");
        rate = sc.nextFloat();
        if (rate >0 && rate<= 30)
            break;
        else
            System.out.println("Enter a valid rate between 1 to 30");}
        rate = rate/1200;
        while (true){
        System.out.print("Time period in years: ");
        n = sc.nextInt();
        if (n>0)
            break;
        else
            System.out.println("Enter a valid number greater than 0");}
        n = n*12;
        double mortgage = principle * (rate * Math.pow(1 + rate, n) / (Math.pow(1 + rate, n) - 1));
        System.out.println(NumberFormat.getCurrencyInstance().format(mortgage));
    }
}