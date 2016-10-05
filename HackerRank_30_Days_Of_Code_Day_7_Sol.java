import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        in.close();
        
        //Solution
        int[] sol = new int[n];
        for(int i = 0; i < n; i++) {
            sol[i] = arr[n - 1 - i];
            System.out.print(sol[i] + " ");
        }
    }
}
