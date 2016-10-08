import java.io.*;
import java.util.*;

class Sorting {
    
    public static int bubbleSort(int[] x) {
        
        int endPosition = x.length - 1;
        int swapPosition = 0;
        int numSwaps = 0;
        
        while( endPosition > 0 ) {
            
            for(int i = 0; i < endPosition; i++) {
                
                if( x[i] > x[i + 1] ){
                    // Swap elements 'i' and 'i + 1':
                    int tmp = x[i];
                    x[i] = x[i + 1];
                    x[i + 1] = tmp;
                    
                    numSwaps++;
                    swapPosition = i;
                } // end if
            } // end for
            
            endPosition = swapPosition;
        } // end while
        return numSwaps;
    } // end bubbleSort
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        scan.close();
        
        System.out.println("Array is sorted in " + Sorting.bubbleSort(a) + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[n-1]);
    }
}