package Recursion;
import java.util.*;
public class SumOfDigits {
    static int getSum(int n) {
        if(n == 0)
            return 0;
        return (getSum(n/10) + n%10) ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int last = n%10;
        System.out.println(getSum(n));
    }
}
