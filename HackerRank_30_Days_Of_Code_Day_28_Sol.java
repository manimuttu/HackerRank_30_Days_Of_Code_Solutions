import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int N = Integer.parseInt(scan.nextLine());
        List<String> nameList = new ArrayList();
        Pattern p = Pattern.compile(".+@gmail\\.com$");
        
        for(int i = 0; i < N; i++) {
            String firstName = scan.next();
            String emailID = scan.next();
            Matcher m = p.matcher(emailID);
            if (m.find()) {
                nameList.add(firstName);
            }
        }
        
        Collections.sort(nameList);
        
        for(String firstName : nameList) {
            System.out.println(firstName);
        }
        
        scan.close();
    }
}