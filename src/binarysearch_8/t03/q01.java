package binarysearch_8.t03;

import java.util.Arrays;

public class q01 {
	public static void main(String[] args) {
		int v[]= {2,3,6,8,9};
		Arrays.sort(v); // �迭 ����
		int key=8;
		int index=binarySearch(v, key); // ���ĵ� �迭 �� �ڷ� ��ġ ���� Ž��
		if(index<0) System.out.println("�迭 �� �ڷ� ����");
		else System.out.println("�ڷ� �߰� ��ġ(�迭 �� index): "+index);
	}
	private static int binarySearch(int[] v, int key) {
		int left=0, right=v.length-1;
		while(left<=right){
			int m=left+(right-left)/2; //�̷�������� �ؾ� 21�� �ȳѾ
			if(key==v[m]) return m;
			if(key<v[m]) right=m-1;
			else left=m+1;
		}
		return -1;
	}
}