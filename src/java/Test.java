package java;

@FunctionalInterface
interface M { int max(int x, int y); } // binary
class Test {
	public static void main(String args[]) {
		M m = (a, b) -> a > b ? a : b; //binary
		int result = m.max(10, 20);
		System.out.println(result);
	}
}