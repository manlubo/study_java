package lesson06_2;

public class ArrEX10_2 {
	public static void main(String[] args) {
		
		//첫번째
		int[][] matrix = new int[3][3];
		
		matrix[0][0] = 1;
		matrix[0][1] = 2;
		matrix[0][2] = 3;
		matrix[1][0] = 4;
		matrix[1][1] = 5;
		matrix[1][2] = 6;
		matrix[2][0] = 7;
		matrix[2][1] = 8;
		matrix[2][2] = 9;
		
		
		
		// 두번 째
		
		int [][] matrix2 = {{1,2,3}, {4,5,6}, {7,8,9}};
		
		
		//세번째
		
		int[][] matrix3 = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		//네번쨰
		int[][] matrix4 = new int[3][3];
		int count = 1;
		for (int i = 0; i < matrix4.length; i++) {
			for (int j = 0; j < matrix4[i].length; j++) {
				matrix4[i][j] = count++;
			}
			System.out.println();
		}
		
		
		
		System.out.println("[첫번째]");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("[두번째]");
		for (int i = 0; i < matrix2.length; i++) {
			for (int j = 0; j < matrix2[i].length; j++) {
				System.out.print(matrix2[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("[세번째]");
		for (int i = 0; i < matrix3.length; i++) {
			for (int j = 0; j < matrix3[i].length; j++) {
				System.out.print(matrix3[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("[네번째]");
		for (int i = 0; i < matrix4.length; i++) {
			for (int j = 0; j < matrix4[i].length; j++) {
				System.out.print(matrix4[i][j] + " ");
			}
			System.out.println();
		}
	
	}
}
