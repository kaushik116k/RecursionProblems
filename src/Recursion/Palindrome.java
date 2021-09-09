package Recursion;
import java.util.*;
public class Palindrome {
    static Boolean isPalindrome(String str, int start, int end) {
        if(start >= end)
            return  true;
        return (str.charAt(start) == str.charAt(end) && isPalindrome(str,start+1,end-1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String toCheck = sc.next();
        int lengthOfString = toCheck.length();
        if(isPalindrome(toCheck,0,lengthOfString-1)) {
            System.out.println("The given string is palindrome");
        }
    }
}
