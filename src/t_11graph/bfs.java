package t_11graph;

import java.util.Arrays;
import java.util.LinkedList;

public class bfs{
private static void bfs(LinkedList<Integer>[] adjList, int V, int start){
	boolean visited[]=new boolean[V];
	double dist[]=new double[V];
	int prev[]=new int[V];
	for (int i = 0; i < dist.length; i++) dist[i]=Double.MAX_VALUE;
	for (int i = 0; i < prev.length; i++) prev[i]=-1;
	LinkedList<Integer> queue=new LinkedList<>();
	visited[start]=true;
	dist[start]=0;
	queue.addLast(start);
	while(!queue.isEmpty()){
		int v=queue.removeFirst();
		for (Integer w : adjList[v]) {
			if(visited[w]==false){
				visited[w]=true;
				dist[w]=dist[v]+1;
				prev[w]=v;
				queue.addLast(w);
			}
		}
	}
	System.out.println(Arrays.toString(dist));
}}