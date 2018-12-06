package t_11graph;

import java.util.LinkedList;

public class q08 {
	public static void main(String[] args) {
		int V = 12;
		String input = "0 1 0 2 0 3 1 4 1 5 2 5 2 6 3 6 3 7 3 8 4 9 5 9 6 9 6 10 7 10 8 10 9 11 10 11";
		LinkedList<Integer> adjList[] = new LinkedList[V];
		for (int i = 0; i < adjList.length; i++)
			adjList[i] = new LinkedList<>();
		String s[] = input.split("\\s+");
		for (int i = 0; i < s.length; i += 2) {
			int v1 = Integer.parseInt(s[i]);
			int v2 = Integer.parseInt(s[i + 1]);
			adjList[v1].add(v2);
			adjList[v2].add(v1);
		}
		boolean visited[] = new boolean[V];
		int start = 0, distance = 3;
		bfs(adjList, V, visited, start, distance);
	}

	private static void bfs(LinkedList<Integer>[] adjList, int V, boolean[] visited, int v, int distance) {
	visited[v]=true;
	System.out.println(v+" ");
	for(Integer i:adjList[v]) {
		if(visited[i]==false)bfs(adjList,v,visited,i, i);
	}
	}
}