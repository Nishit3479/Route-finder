package ai.lab.project;

import java.util.*;

public class BFSDFS 
{
	public static void main(String []args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Choose Option :\n1.BFS\n2.DFS");
		int a = in.nextInt();
		if(a==1)
		{
				BFS bfs = new BFS(20); 

				bfs.addEdge(0, 1);
				bfs.addEdge(0, 2);
				bfs.addEdge(0, 3);
				bfs.addEdge(0, 4);
				bfs.addEdge(1, 5);
				bfs.addEdge(1, 6);
				bfs.addEdge(1, 9);
				bfs.addEdge(2, 0);
				bfs.addEdge(2, 6);
				bfs.addEdge(3, 2);
				bfs.addEdge(3, 5);
				bfs.addEdge(3, 7);
				bfs.addEdge(3, 11);
				bfs.addEdge(4, 0);
				bfs.addEdge(4, 3);
				bfs.addEdge(4, 7);
				bfs.addEdge(5, 12);
				bfs.addEdge(6, 9);
				bfs.addEdge(7, 8);
				bfs.addEdge(7, 10);
				bfs.addEdge(7, 11);
				bfs.addEdge(8, 12);
				bfs.addEdge(9, 12);
				bfs.addEdge(10, 11);
				bfs.addEdge(10, 12);
				bfs.addEdge(10, 13);
				bfs.addEdge(10, 14);
				bfs.addEdge(11, 4);
				bfs.addEdge(11, 12);
				bfs.addEdge(11, 14);
				bfs.addEdge(12, 15);
				bfs.addEdge(12, 16);
				bfs.addEdge(12, 17);
				bfs.addEdge(13, 17);
				bfs.addEdge(14, 10);
				bfs.addEdge(14, 17);
				bfs.addEdge(14, 18);
				bfs.addEdge(15, 12);
				bfs.addEdge(16, 19);
				bfs.addEdge(17, 14);
				bfs.addEdge(17, 15);
				bfs.addEdge(17, 19);
				bfs.addEdge(18, 17);
				bfs.addEdge(19, 18);

				System.out.print("Enter the Starting Node : ");
				int n = in.nextInt();
				System.out.print("Enter the Ending Node : ");
				int m = in.nextInt();
				System.out.println("The Route from Node "+n+" to Node "+m+" using Breadth First Search (BFS) : "); 
				bfs.Bfs(n, m); 
		}
		else if(a==2)
		{
			DFS dfs = new DFS(20); 

			dfs.addEdge(0, 1);
			dfs.addEdge(0, 2);
			dfs.addEdge(0, 3);
			dfs.addEdge(0, 4);
			dfs.addEdge(1, 5);
			dfs.addEdge(1, 6);
			dfs.addEdge(1, 9);
			dfs.addEdge(2, 0);
			dfs.addEdge(2, 6);
			dfs.addEdge(3, 2);
			dfs.addEdge(3, 5);
			dfs.addEdge(3, 7);
			dfs.addEdge(3, 11);
			dfs.addEdge(4, 0);
			dfs.addEdge(4, 3);
			dfs.addEdge(4, 7);
			dfs.addEdge(5, 12);
			dfs.addEdge(6, 9);
			dfs.addEdge(7, 8);
			dfs.addEdge(7, 10);
			dfs.addEdge(7, 11);
			dfs.addEdge(8, 12);
			dfs.addEdge(9, 12);
			dfs.addEdge(10, 11);
			dfs.addEdge(10, 12);
			dfs.addEdge(10, 13);
			dfs.addEdge(10, 14);
			dfs.addEdge(11, 4);
			dfs.addEdge(11, 12);
			dfs.addEdge(11, 14);
			dfs.addEdge(12, 15);
			dfs.addEdge(12, 16);
			dfs.addEdge(12, 17);
			dfs.addEdge(13, 17);
			dfs.addEdge(14, 10);
			dfs.addEdge(14, 17);
			dfs.addEdge(14, 18);
			dfs.addEdge(15, 12);
			dfs.addEdge(16, 19);
			dfs.addEdge(17, 14);
			dfs.addEdge(17, 15);
			dfs.addEdge(17, 19);
			dfs.addEdge(18, 17);
			dfs.addEdge(19, 18);

			System.out.print("Enter the Starting Node : ");
			int n = in.nextInt();
			System.out.print("Enter the Ending Node : ");
			int m = in.nextInt();
			System.out.println("The Route from Node "+n+" to Node "+m+" using Depth First Search (DFS) : "); 
			dfs.Dfs(n, m); 
		}
		else
		{
			System.out.println("Invalid Choice...!!");
		}
	}
}
