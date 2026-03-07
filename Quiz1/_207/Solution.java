import java.io.*;
import java.util.*;

class Solution {
    public static int[] stringBreaker(String s, int num){
        StringTokenizer st = new StringTokenizer(s);
        int [] arr = new int[num];
        int i = 0;
        while(st.hasMoreTokens()){
            arr[i] = Integer.parseInt(st.nextToken());
            i++;
        }
        return arr;
    }
    // s1 --> N , M , L , K
    // s2 --> arr1
    // s3 =--> arr2
    // s4 --> arr3
    public static String solve(String s1, String s2, String s3, String s4){
        StringBuilder sb = new StringBuilder();
        int [] arr = stringBreaker(s1, 4);
        int [] arr1 = stringBreaker(s2, arr[0]);
        int [] arr2 = stringBreaker(s3, arr[1]);
        int [] arr3 = stringBreaker(s4, arr[2]);
        int k = arr[3];

        // Main Operation
        int pt1 = 0;
        int pt2 = arr2.length-1;
        int pt3 = arr3.length-1;
        int count = 0;
        int prevsum = Integer.MAX_VALUE;
        while(pt1<arr1.length || pt2>=0 || pt3 >= 0){
            int sum = arr1[pt1] + arr2[pt2] + arr3[pt3];

            if(count == k){
                return sb.append(prevsum).toString();
            }

            if(sum<prevsum){
                prevsum = sum;
                count++;
            }
            pt1++;
            pt2++;
            pt3++;
        }
        return null;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        String testString = br.readLine();
        int t = Integer.parseInt(testString);
        for(int i = 0; i<t ; i++){
            String line1 = br.readLine();
            String line2 = br.readLine();
            String line3 = br.readLine();
            String line4 = br.readLine();
            pw.println(solve(line1, line2, line3, line4));
        }
        System.exit(0);
    }
}