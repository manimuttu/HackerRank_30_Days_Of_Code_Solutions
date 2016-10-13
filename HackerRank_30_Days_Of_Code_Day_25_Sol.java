import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        
        for(int i = 0; i < T; i++) {
            int n = scan.nextInt();
            if(n == 1 || Math.sqrt(n) == (int)Math.sqrt(n)) {
                System.out.println("Not prime");
            } else {
                boolean isPrime = true;
                for(int j = 2; j < Math.sqrt(n); j++) {
                    if(n % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                System.out.println(isPrime?"Prime":"Not prime");
            }
        }
        scan.close();
    }
}