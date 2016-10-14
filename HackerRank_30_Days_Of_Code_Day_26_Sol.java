import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int[] D = new int[2];
        int[] M = new int[2];
        int[] Y = new int[2];
        for(int i = 0; i < 2; i++) {
            D[i] = scan.nextInt();
            M[i] = scan.nextInt();
            Y[i] = scan.nextInt();
        }
        if(Y[0] < Y[1] || (Y[0] == Y[1] && M[0] < M[1]) || (Y[0] == Y[1] && M[0] == M[1] && D[0] < D[1])) {
            System.out.println(0);
        } else if(Y[0] > Y[1]) {
            System.out.println(10000);
        } else if(M[0] > M[1]) {
            System.out.println(500 * (M[0] - M[1]));
        } else {
            System.out.println(15 * (D[0] - D[1]));
        }
        scan.close();
    }
}