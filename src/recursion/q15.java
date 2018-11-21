package recursion;

/*import java.util.Random;

public class q15 {
	public static void main(String[] args) {
		int R=5, C=5, count=0;
		char ground[][]=new char[R][C];
		Random random=new Random();
		for (int i = 0; i < ground.length; i++){ // ���� ������ �������� ���� ��� ����
			for (int j = 0; j < ground[i].length; j++) ground[i][j]=(random.nextInt(3)==0)? '1' : '0';
		}
		for (int i = 0; i < ground.length; i++){ // ��� ���
			for (int j = 0; j < ground[i].length; j++) System.out.print(ground[i][j]);
			System.out.println();
		}
		for (int i = 0; i < ground.length; i++) {
			for (int j = 0; j < ground[i].length; j++){
				if(ground[i][j]=='1'){ground[i][j]=0; dfs(ground, R, C, i, j); count++; }
			}
		}
		System.out.println(count);
	}
	private static void dfs(char[][] ground, int R, int C, int i, int j) {
		int dx[]= {-1,-1,-1,0,0,1,1,1};
		int dy[]= {-1,0,1,-1,1,-1,0,1};
		for(int k=0;k<dx.length;k++) {

			if(i+dx[k]<0 || i+dx[k]>=R || j+dy[k]<0 || j+dy[k]>=C)continue;
			if(ground[i+dx[k]][j+dy[k]]=='1') {
				ground[i+dx[k]][j+dy[k]]='0';
				dfs(ground,R,C,i+dx[k],j+dy[k]);
			}
		}
	}
}*/

import java.util.Random;

public class q15 {
	static int cnt = 1;

	public static void main(String[] args) {
		int R = 5, C = 5;
		char ground[][] = new char[R][C];
		Random random = new Random();
		for (int i = 0; i < ground.length; i++) { // ���� ������ �������� ���� ��� ����
			for (int j = 0; j < ground[i].length; j++)
				ground[i][j] = (random.nextInt(3) == 0) ? '1' : '0';
		}
		for (int i = 0; i < ground.length; i++) { // ��� ���
			for (int j = 0; j < ground[i].length; j++)
				System.out.print(ground[i][j]);
			System.out.println();
		}
		for (int i = 0; i < ground.length; i++) {
			for (int j = 0; j < ground[i].length; j++) {
				if (ground[i][j] == '1') {
					ground[i][j] = 0;
					dfs(ground, R, C, i, j);
					System.out.print(cnt + " ");
					cnt = 1;
				}
			}
		}
	}

	private static void dfs(char[][] ground, int R, int C, int i, int j) {

		int dx[] = { -1, -1, -1, 0, 0, 1, 1, 1 };
		int dy[] = { -1, 0, 1, -1, 1, -1, 0, 1 };
		for (int k = 0; k < dx.length; k++) {

			if (i + dx[k] < 0 || i + dx[k] >= R || j + dy[k] < 0 || j + dy[k] >= C)
				continue;
			if (ground[i + dx[k]][j + dy[k]] == '1') {
				cnt++;
				ground[i + dx[k]][j + dy[k]] = '0';
				dfs(ground, R, C, i + dx[k], j + dy[k]);
			}
		}
	}
}

//클론 테스트중
