package recursion;

public class q22 {

	public static void main(String[] args) {
		int G=1000000000;
		long steps=fact(20);
		System.out.println((steps/G+"초"));
		System.out.println((steps/G/60+"분"));
		System.out.println((steps/G/60/60+"시간"));
		System.out.println((steps/G/60/60/24+"일"));
		System.out.println((steps/G/60/60/24/365+"년"));
		
	}
	public static long fact(int i) {
	if(i==0)return 1;
	return i*fact(i-1);
	}
}
