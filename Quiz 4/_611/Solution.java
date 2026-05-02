import java.io.*;
import java.util.*;

class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        
        String test = br.readLine();
        StringTokenizer testToken = new StringTokenizer(test);
        int testCase = Integer.parseInt(testToken.nextToken());
        for(int t = 0; t<testCase; t++){
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line);
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());  //position x
            int y = Integer.parseInt(st.nextToken());  //position y

            if(k == 0){
                
            }
            int [][] mat = new int[n][n];
            mat[x][y] = 1;

            int [] dis_x = {-1,0,1,-1,1,-1,0,1};
            int [] dis_y = {-1,-1,-1,0,0,1,1,1};
            int []way = new int[8];

            for(int i = 0; i<dis_x.length; i++){
                int new_x = x + dis_x[i];
                int new_y = y + dis_y[i];
                for(int j = 0; j<k; j++){
                    new_x = x + dis_x[i];
                    new_y = y + dis_y[i];
                    if(new_x != -1  || new_x != -1 || new_y<=n-1 || new_x<=n-1){
                        way[i]++;
                    }
                }
            }
            int num = 0;
            for(int i = 0; i<way.length;i++){
                num += way[i];
            }
            wr.println(num);

        }
        wr.close();
    }
}