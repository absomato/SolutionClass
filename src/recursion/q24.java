package recursion;

public class q24 {
	static int sum=21; // 부분집합 내 정수들의 합이 되어야 할 값
	static int n[]={1,3,4,5,8,9}; // 입력: n개 정수
	public static void main(String[] args) {
		int subset[]=new int[n.length];
		subsetSum(subset, 0);
	}
	private static void subsetSum(int[] subset, int i) {
		if(i==n.length){
			int s=0;
			for(int j=0;j<n.length;j++)
				if(subset[j]==1)s+=n[j];
			if(s==sum) {
				for(int j=0;j<n.length;j++) {
					if(subset[j]==1)System.out.print(n[j]);
				}
				System.out.println();
			}
			// 부분집합 내 정수의 합이 sum이 되는지 검사 후 부분집합 출력
			return;
		}
		subset[i]=0;
		subsetSum(subset, i+1);
		subset[i]=1;
		subsetSum(subset, i+1);
	}
}