package lesson07;

import java.util.Arrays;

public class MemberMain2 {
	public static void main(String[] args) {
		Member[] members = new Member[3]; // 배열 초기화 하기 위한 new
		
		System.out.println(Arrays.toString(members));
		
		members[0] = new Member(); // 멤버를 초기화하기 위한 new
		System.out.println(Arrays.toString(members));
		members[0].num = 1;
		members[0].name = "김윤석";
		members[0].age = 27;
		System.out.println(members[0].num);
		System.out.println(members[0].name);
		System.out.println(members[0].age);
	}
}
