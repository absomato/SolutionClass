package recursion;

import java.util.Arrays;

public class q21 {

	public static void main(String[] args) {
		String n[]= {"서울","대구","부산"};
		perm(n, 0);
	}
	private static void perm(String[] n, int i) {
		if(i==n.length){
			System.out.println(Arrays.toString(n));
			return;
		}
		for (int j = i; j < n.length; j++) {
			String temp=n[i]; n[i]=n[j]; n[j]=temp; // swap
			perm(n, i+1);
			temp=n[i]; n[i]=n[j]; n[j]=temp; // swap
		}
	}
} 