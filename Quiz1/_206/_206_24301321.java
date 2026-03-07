// 1.000000 24301321 CSE-09B-10L-L31 24301321
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

    public static String solve(String s1, String s2, String s3){
        StringBuilder sb = new StringBuilder();
        int[] arr = stringBreaker(s1, 3);
        int [] arr1 = stringBreaker(s2,arr[0]);  // first array
        int [] arr2 = stringBreaker(s3, arr[1]); // Second array
        int k = arr[2];

        //main operation
        int left = 0;
        int right = arr2.length-1;
        int minDiff = Integer.MAX_VALUE;
        int bestLeft = 0;
        int bestRight = 0;
        while(left < arr1.length && right>=0){
            int sum = arr1[left] + arr2[right];
            int currDiff = Math.abs(sum-k);

            if(currDiff<minDiff){
                minDiff = currDiff;
                bestLeft = left;
                bestRight = right;
            }

            if(sum>k){
                right--;
            }
            else if(sum<k){
                left++;
            }
            else{
                return sb.append(left+1).append(" ").append(right+1).toString();
            }
        }
        return sb.append(bestLeft+1).append(" ").append(bestRight+1).toString();
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
            pw.println(solve(line1, line2, line3));
        }
        pw.flush();
        System.exit(0);
    }
}

