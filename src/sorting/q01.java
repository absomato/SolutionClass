package sorting;

import java.util.Arrays;

public class q01 {
	public static void main(String[] args) {
		int v[]=new int[]{5,8,1,9,3,5,1,5};
		bubbleSort(v);
		System.out.println(Arrays.toString(v));
	}
	private static void bubbleSort(int[] v) {
		int sw=1;
		int cnt=0;
		for (int i = 0; i < v.length; i++) {
			sw=1;
			for (int j = 1; j < v.length-i; j++) {
				if(v[j-1]>v[j]) {
					cnt++;
					int temp=v[j];
					v[j]=v[j-1];
					v[j-1]=temp;
					sw=0;
				}
				
				
			}
			if(sw==1)break;
		}
		System.out.println(cnt);
	}
}