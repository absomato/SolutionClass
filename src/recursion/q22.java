package recursion;

public class q22 {

	public static void main(String[] args) {
		int G=1000000000;
		long steps=fact(20);
		System.out.println((steps/G+"��"));
		System.out.println((steps/G/60+"��"));
		System.out.println((steps/G/60/60+"�ð�"));
		System.out.println((steps/G/60/60/24+"��"));
		System.out.println((steps/G/60/60/24/365+"��"));
		
	}
	public static long fact(int i) {
	if(i==0)return 1;
	return i*fact(i-1);
	}
}
