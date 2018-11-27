package sorting;

/*import java.util.Arrays;

public class q04 {
	public static void main(String[] args) {
		int n[] = { 1, 3, 5, 7, 8 };
		int m[] = { 2, 4, 6, 7, 10 };
		int v[] = mergeArray(n, m);
		System.out.println(Arrays.toString(v));
	}

	private static int[] mergeArray(int[] n, int[] m) {
		int v[]=new int[n.length+m.length];
		int ni = 0, mi = 0, k = 0;
		while (true) {
			if (ni < n.length && mi < m.length) {
				if (n[ni] > m[mi])
					v[k++] = m[mi++];
				else
					v[k++] = n[ni++];
			} else {
				if (ni >= n.length) {
					for (int i = mi; i < m.length; i++) {
						v[k++] = m[i];
					}
				} else {
					for (int i = ni; i < n.length; i++) {
						v[k++] = n[i];
					}
				}
				break;
			}
		}
		return v;
	}
}*/
import java.util.Arrays;

public class q04 {
	public static void main(String[] args) {
		int n[] = { 1, 3, 5, 7, 8 };
		int m[] = { 2, 4, 6, 7, 10 };
		int v[] = mergeArray(n, m);
		System.out.println(Arrays.toString(v));
	}

	private static int[] mergeArray(int[] n, int[] m) {
		int v[] = new int[n.length + m.length];
		int ni = 0, mi = 0, k = 0;
		while (ni < n.length && mi < m.length) {

			if (n[ni] > m[mi])
				v[k++] = m[mi++];
			else
				v[k++] = n[ni++];
		}
		if (ni >= n.length) {
			for (int i = mi; i < m.length; i++) {
				v[k++] = m[i];
			}
		} else {
			for (int i = ni; i < n.length; i++) {
				v[k++] = n[i];
			}
		}

		return v;
	}
}
//testasdfasdf