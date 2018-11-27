package sorting;

import java.util.Arrays;
import java.util.LinkedList;

public class q20 {
	public static void main(String[] args) {
		int n[]={432109876,423,312,34,43,21,223,42};
		radixSort(n, 10, 9); // 최대 9자리까지 10진수 기수정렬
		System.out.println(Arrays.toString(n));
	}
	private static void radixSort(int[] n, int Radix, int Length) {
		int radix=10;
		LinkedList<Integer> queue[]=new LinkedList[radix];
		for(int q=0;q<queue.length;q++)queue[q]=new LinkedList<>();
		for(int i=0;i<n.length;i++)queue[(n[i]/1)%radix].add(n[i]);
		for(int q=0,i=0;q<queue.length;q++)while(!queue[q].isEmpty())n[i++]=queue[q].remove();
	}
}