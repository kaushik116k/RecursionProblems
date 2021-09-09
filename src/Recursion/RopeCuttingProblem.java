package Recursion;
import java.util.*;
public class RopeCuttingProblem {
    static int ropeCutting(int ropeLength, int division1, int division2, int division3) {
        if(ropeLength == 0)
            return 0;
        if (ropeLength < 0)
            return -1;
        int res = Math.max(Math.max(ropeCutting(ropeLength-division1, division1, division2, division3),
                    ropeCutting(ropeLength-division2, division1, division2, division3)),
                ropeCutting(ropeLength-division3, division1, division2, division3));
        if(res == -1)
            return -1;

        return res+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of rope");
        int ropeLength = sc.nextInt();
        System.out.println("enter length of division1");
        int division1 = sc.nextInt();
        System.out.println("enter length of division2");
        int division2 = sc.nextInt();
        System.out.println("enter length of division3");
        int division3 = sc.nextInt();

        System.out.println("Maximum number of divisions we can do is : " + ropeCutting(ropeLength,division1,division2,division3));

    }
}
