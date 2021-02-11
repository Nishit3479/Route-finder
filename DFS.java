package ai.lab.project;

import java.io.*;
import java.util.*;
 
class DFS
{
    private int V; 
    private LinkedList<Integer> adj[];
    DFS(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    void addEdge(int v, int w)
    {
        adj[v].add(w);
    }
 
    void DFSUtil(int v, boolean visited[], int u)
    {
        visited[v] = true;
        System.out.print(v + " ");
        if(v==u)
        {
        	System.exit(0);
        }
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) 
        {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited, u);
        }
    }
    void Dfs(int v, int u)
    {
        boolean visited[] = new boolean[V];
        DFSUtil(v, visited, u);
    }
}