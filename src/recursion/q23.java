package recursion;

import java.util.Arrays;

/*public class q23 {
	public static void main(String[] args) {
		int v[]=new int[4];
		bitString(v, 0);
	}
	private static void bitString(int[] v, int i) {
		if(i==v.length){
			System.out.println(Arrays.toString(v));
			return;
		}
		v[i]=0;
		bitString(v, i+1);
		v[i]=1;
		bitString(v, i+1);
	}
}*/
/*public class q23 {
	public static void main(String[] args) {
		int v[]=new int[3];
		bitString(v, 0);
	}
	private static void bitString(int[] v, int i) {
		if(i==v.length){
			System.out.println(Arrays.toString(v));
			return;
		}
		v[i]=1;
		bitString(v, i+1);
		v[i]=0;
		bitString(v, i+1);
	}
}*/
/*public class q23 {
	public static void main(String[] args) {
		char v[]=new char[3];
		bitString(v, 0);
	}
	private static void bitString(char[] v, int i) {
		if(i==v.length){
			System.out.println(Arrays.toString(v));
			return;
		}
		v[i]='A';
		bitString(v, i+1);
		v[i]='B';
		bitString(v, i+1);
	}
}*/
/*public class q23 {
	public static void main(String[] args) {
		int v[]=new int[2];
		bitString(v, 0);
	}
	private static void bitString(int[] v, int i) {
		if(i==v.length){
			for(int j=0;j<v.length;j++)System.out.print(v[j]);
			System.out.println();
			return;
		}
		for(int j=0;j<=2;j++) {
		v[i]=j;
		
		bitString(v, i+1);
		}
	}
}*/
/*public class q23 {
	public static void main(String[] args) {
		int v[]=new int[2];
		bitString(v, 0);
	}
	private static void bitString(int[] v, int i) {
		if(i==v.length){
			for(int j=0;j<v.length;j++)System.out.print(v[j]);
			System.out.println();
			return;
		}
		for(int j=0;j<=7;j++) {
		v[i]=j;
		
		bitString(v, i+1);
		}
	}
}*/
public class q23 {
	public static void main(String[] args) {
		int v[]=new int[3];
		bitString(v, 0);
	}
	private static void bitString(int[] v, int i) {
		if(i==v.length){
			for(int j=0;j<v.length;j++) {
				if(v[j]==1)System.out.print(j);
			}
			System.out.println();
			return;
		}
		
		v[i]=0;
		
		bitString(v, i+1);
		v[i]=1;
		bitString(v,i+1);
		}
	
}