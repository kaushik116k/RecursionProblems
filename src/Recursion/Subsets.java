package Recursion;
import java.util.*;
public class Subsets {
    static void subsets(String s, String current, int i){
        if(i == s.length()){
            System.out.println(current);
            return;
        }
        subsets(s,current,i+1);
        subsets(s,current + s.charAt(i),i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        subsets(s,"",0);
    }
}
