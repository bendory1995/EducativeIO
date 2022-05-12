import java.util.*;
public class GraphDFS {
    static int numVertices;
    static LinkedList<Integer>[] tempList;

    public static void main(String [] args){
        
    }

    public static void DFSRecursion(int startVertex){
        boolean[] visitedArr = new boolean[numVertices];
        dfs(startVertex, visitedArr);
    }

    public static void dfs(int start, boolean [] visitedArr){
        visitedArr[start] = true;
        
        for(int i = 0 ; i < tempList[start].size(); i++){
            int toNode = tempList[start].get(i);
            if(!visitedArr[toNode]){
                dfs(toNode, visitedArr);
            }
        }

    }
}
