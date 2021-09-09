package Recursion;

import java.util.Scanner;

public class TowerOfHanoi {
    static void TOH(int n, char A, char B, char C){
        if(n == 1){
            System.out.println("move 1 from " + A + " to " + C);
            return;
        }
        TOH(n-1,A,C,B);
        System.out.println("move " + n + " from " + A + " to "+ C);
        TOH(n-1,B,A,C);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of disks");
        int n = sc.nextInt();
        char a,b,c;
        a ='A'; b = 'B'; c= 'C';
        TOH(n,a,b,c);

    }
}
