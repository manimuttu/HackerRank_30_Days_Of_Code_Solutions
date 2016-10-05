import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        for(int i = 0; i < n; i++) {
            char[] S = scan.next().toCharArray();
            
            for(int j = 0; j < S.length; j += 2) {
                System.out.print(S[j]);
            }
            System.out.print(" ");
            for(int j = 1; j < S.length; j += 2) {
                System.out.print(S[j]);
            }
            System.out.println();
        }
        scan.close();
    }
}