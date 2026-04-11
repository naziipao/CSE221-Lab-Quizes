import java.io.*;
import java.util.*;

class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);

        String firstLine = br.readLine();
        StringTokenizer firstSt = new StringTokenizer(firstLine);
        int testCase = Integer.parseInt(firstSt.nextToken());

        for(int t = 0; t<testCase; t++){

            String line1 = br.readLine();
            StringTokenizer st1 = new StringTokenizer(line1);
            int N = Integer.parseInt(st1.nextToken());  //nodes
            int M = Integer.parseInt(st1.nextToken());  //edges

            int[][] mat = new int[N+1][N+1];

            for(int i = 0; i<M; i++){
                String line = br.readLine();
                StringTokenizer st = new StringTokenizer(line);
                int row = Integer.parseInt(st.nextToken());
                int col = Integer.parseInt(st.nextToken());
                int weight = Integer.parseInt(st.nextToken());

                mat[row-1][col-1] = weight;

            }

            //Printing the matrix
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i<N; i++){
                for(int j = 0; j<N;j++){
                    sb.append(mat[i][j]).append(" ");
                }
                sb.append("\n");
            }
            wr.print(sb.toString());

        }
        wr.close();
    }
}