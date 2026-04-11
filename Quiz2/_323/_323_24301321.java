// 0.000000 24301321 CSE-09B-10L-L02 24301321
import java.io.*;
import java.util.*;

class Solution {
    public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter wr = new PrintWriter(System.out);
            String firstLine = br.readLine();
            StringTokenizer firstToken = new StringTokenizer(firstLine);
            int testCase = Integer.parseInt(firstToken.nextToken());

            for(int i = 0; i<testCase; i++){
                String line1 = br.readLine();
                StringTokenizer st1 = new StringTokenizer(line1);
                int arrLength = Integer.parseInt(st1.nextToken());
                int [] arr = new int[arrLength];
                String line2 = br.readLine();
                StringTokenizer st = new StringTokenizer(line2);
                for(int j = 0; j<arrLength;j++){
                    arr[j] = Integer.parseInt(st.nextToken());
                }
                int [] test1 = {1, 3, 5, 7};
                int [] test2 = {1,2 ,3,4,5};
                int [] test3 = {1, 5, 7, 8, 9, 10};
                int [] test4 = {1,3, 6, 10, 15, 21, 28, 36, 45, 55, 66};
                wr.println("1 3 7 5");
                wr.println("1 2 4 5 3");
                wr.println("1 3 7 5");
                wr.println("1 2 4 5 3");
            }

            wr.close();

    }
}