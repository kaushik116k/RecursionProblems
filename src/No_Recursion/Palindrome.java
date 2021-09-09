package No_Recursion;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String");
        String input = sc.next();

        // reversing the string
        byte[] strAsByteArray = input.getBytes();

        byte[] result = new byte[strAsByteArray.length];

        for (int i = 0; i < strAsByteArray.length; i++)
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];

        String reverseString = new String(result);
        if(input.equals(reverseString)){
            System.out.println("Given string is Palindrome");
        }
        else
            System.out.println("Given string is not palindrome");
    }
}
