package lesson06_2;

import java.util.Arrays;

public class ArrEx10 {
	public static void main(String[] args) {
		int[][] arr = {{1,2,3}/* 0번째 인덱스*/,{4,5,6},{7,8,9}};
		
		System.out.println(arr[1][0]);
		
		
		String[][][] strs = {
				{},{{"A", "B", "C"}, {"가", "나", "다"}}, {{"0", "1"}}, 
		};
		// strs.length
		// {}
		// {{"A", "B", "C"}, {"가", "나", "다"}}
		// {{"0", "1"}}
		System.out.println(strs.length);// String 3차원 배열
		System.out.println(strs[1].length);// String 2차원 배열
		System.out.println(strs[1][1].length);// String 1차원 배열
		System.out.println(strs[1][1][1]); // String 타입
		 
	}
}
