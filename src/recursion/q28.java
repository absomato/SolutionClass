package recursion;

public class q28{
	public static void main(String[] args) {
		int N=5, K=2;
		int v[]=new int[N];
		genCombinations(N, K, 0, v, 0);
	}
	private static void genCombinations(int N, int K, int startIndex, int v[], int len) {
		if(len==K) {
			String s="";
			for (int i = 0; i < v.length; i++) s+=v[i];
			System.out.println(s);
			return;
		}
		for (int i = startIndex; i < N; i++) {
			v[i]++; genCombinations(N, K, i, v, len+1); v[i]--;
		}
	}
}