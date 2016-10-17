import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        
        for(int i = 0; i < T; i++) {
            int N = scan.nextInt();
            int K = scan.nextInt();
            int temp = 0;
            int[] array = new int[N];
            
            for(int j = 0; j < N; j++) {
                array[j] = j + 1;
            }
            
            for(int j = 0; j < N; j++) {
                for(int m = j + 1; m < N; m++) {
                    int p = array[j] & array[m];
                    if((p < K) && (p > temp)) {
                        temp = p;
                    }
                }
            }
            
            System.out.println(temp);
        }
    }
}