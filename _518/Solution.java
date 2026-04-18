import java.io.*;
import java.util.*;

class Solution {


    public static void solution(ArrayList<ArrayList<Integer>> graph, int[]id, int source){
        id[source] = source;
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        while(!q.isEmpty()){
            int curr_node = q.remove();
            ArrayList<Integer> list = graph.get(curr_node);
            for(int i= 0; i<list.size(); i++){
                int neighbor = list.get(i);
                if(id[neighbor] == 0){
                    id[neighbor] = source;  
                    q.add(neighbor);
                }
            }
        } 
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        String line1 = br.readLine();
        StringTokenizer st1 = new StringTokenizer(line1);
        int testCase = Integer.parseInt(st1.nextToken());  //Found the number of test cases
        for(int t = 0; t<testCase; t++){
            String line2 = br.readLine();
            StringTokenizer st2 = new StringTokenizer(line2); 
            int vertice = Integer.parseInt(st2.nextToken());
            int edge= Integer.parseInt(st2.nextToken());
            int query = Integer.parseInt(st2.nextToken());

            ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

            //Creating the vertices
            for(int i = 0; i<=vertice; i++){
                graph.add(new ArrayList<>());
            }
            //Creating edges
            for(int i = 0; i<edge; i++){
                String line = br.readLine();
                StringTokenizer st = new StringTokenizer(line);
                int start = Integer.parseInt(st.nextToken());
                int end = Integer.parseInt(st.nextToken());
                graph.get(start).add(end);
                graph.get(end).add(start);
            }
            int [] id = new int[vertice+1];
            boolean [] visited = new boolean[vertice+1];
            for(int i =1; i<=vertice; i++){
                if(!visited[i] && id[i]==0){
                    visited[i] = true;
                    solution(graph,id,i);
                }
            }

            for(int i = 0; i<query; i++){
                String line3 = br.readLine();
                StringTokenizer st3 = new StringTokenizer(line3);
                int x = Integer.parseInt(st3.nextToken());
                int y = Integer.parseInt(st3.nextToken());
                if(id[x] == id[y]){
                    wr.println("YES");
                }
                else{
                    wr.println("NO");
                }
            }
        }
        wr.close();
    }
}