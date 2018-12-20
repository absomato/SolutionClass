package t_14hashing;

import java.util.Random;
import java.util.TreeMap;

public class q06 {
	public static void main(String[] args) {
//		Random random = new Random();
//		int N = 10000;
//		int n[] = new int[N];
//		for (int i = 0; i < n.length; i++)
//			n[i] = random.nextInt(N / 2);
		int n[]= {3,4,65,7,4,4,4,4,4,4,4,4,2,2,2,2};
		System.out.println(hfv(n));
	}
	private static int hfv(int[] n) {
		TreeMap<Integer,Integer> m=new TreeMap<>();
		for(int i=0;i<n.length;i++) {
			m.put(n[i], m.containsKey(n[i])?m.get(n[i])+1:1);
//			if(m.containsKey(n[i])) {
//				int freq=m.get(n[i]);
//				freq++;
//				m.put(n[i],freq);
//			}
//			else {
//				m.put(n[i], 1);
//			}
		}
		int maxFreq=0,maxValue=n[0];
		for(Integer key:m.keySet()) {
			int freq=m.get(key);
			if(freq>maxFreq) {
				maxFreq=freq;
				maxValue=key;
			}
		}
		return maxValue;
	}
}