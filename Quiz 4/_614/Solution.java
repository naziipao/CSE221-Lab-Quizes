import java.io.*;
import java.util.*;

class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);

        String testString = br.readLine();
        StringTokenizer st1 = new StringTokenizer(testString);
        int testCase = Integer.parseInt(st1.nextToken());
        for(int t = 0; t<testCase; t++){
            String line2 = br.readLine();
            StringTokenizer st2 = new StringTokenizer(line2);
            int n = Integer.parseInt(st2.nextToken());
            ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
            for(int i = 0; i<=n; i++){
                graph.add(new ArrayList<>());
            }
            
            for(int i = 1; i<n; i++){
                String line = br.readLine();
                StringTokenizer st = new StringTokenizer(line);
                int u = Integer.parseInt(st.nextToken());
                int v = Integer.parseInt(st.nextToken());
                graph.get(u).add(v);
                graph.get(v).add(u);
            }
            //Tree Created

            int [] distance = new int[n+1];
            Queue<Integer> q = new LinkedList<>();
            q.add(1);
            int a = 1;
            for(int i =0 ; i<distance.length; i++){
                distance[i] = -1;
            }
            distance[a] = 0;
            while(!q.isEmpty()){
                int curr = q.remove();
                ArrayList<Integer> list = graph.get(curr);
                for(int i = 0; i<list.size(); i++){
                    int neighbor = list.get(i);
                    if(distance[neighbor] == -1){
                        distance[neighbor] = distance[curr]+1;
                        q.add(neighbor);
                    }

                    if(distance[a]<distance[neighbor]){
                        a = neighbor;
                    }
                }
            }
            q.clear();
            q.add(a);
            distance[a] = 0;
            int b = 1;
            for(int i = 0; i<distance.length; i++){
                distance[i] = -1;
            }
            for(int i = 0 ; i<n; i++){
                
            }





        }
        wr.close();
    }
}