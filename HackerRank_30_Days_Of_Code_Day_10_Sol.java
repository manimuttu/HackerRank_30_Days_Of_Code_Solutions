import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int decimal = scan.nextInt();
        String binaryStr = Integer.toBinaryString(decimal);
        String[] binaryStrArr = binaryStr.split("");
        int iterator = 0;
        int conOneCount = 0;
        int valueHolder = 0;
        
        while (iterator < binaryStrArr.length) {
            if (1 == Integer.parseInt(binaryStrArr[iterator])) {
                conOneCount++;
            } else {
                if (conOneCount > valueHolder) {
                    valueHolder = conOneCount;
                }
                conOneCount = 0;
            }
            iterator++;
        }
        
        if (conOneCount > valueHolder) {
            System.out.println(conOneCount);
        } else {
            System.out.println(valueHolder);
        }
    }
}