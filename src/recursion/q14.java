package recursion;

public class q14 {
	public static void main(String[] args) {
		System.out.println(gcd(64, 48));
	}
	private static int gcd(int a, int b) {
		if(b==0) return a;
		else return gcd(b, a % b);
	}
}