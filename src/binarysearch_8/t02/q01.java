package binarysearch_8.t02;

import java.util.Arrays;

public class q01 {
	public static void main(String[] args) {
		int v[]= {2,3,6,8,9};
		Arrays.sort(v); // �迭 ����
		int key=8;
		int index=Arrays.binarySearch(v, key); // ���ĵ� �迭 �� �ڷ� ��ġ ���� Ž��
		if(index<0) System.out.println("�迭 �� �ڷ� ����");
		else System.out.println("�ڷ� �߰� ��ġ(�迭 �� index): "+index);
	}
}