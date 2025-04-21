package lesson12;

import java.io.File;
import java.util.Arrays;

public class StringEx {
	public static void main(String[] args) {
		String str = "abcd1234abcd";
		System.out.println(str.length());
		
		// indexOf
		System.out.println(str.indexOf("d12"));
		System.out.println(str.indexOf("d2")); // -1 
		System.out.println(str.indexOf("d", 4)); // 4번 인덱스 부터 시작해서 탐색
		System.out.println(str.indexOf("d", 4, 10)); // 4번 인덱스 부터 10번 인덱스 까지 탐색 
		
		// lastIndexOf
		System.out.println(str.lastIndexOf("d")); // 뒤에서 부터 탐색
		System.out.println(str.lastIndexOf("d", 4)); // 뒤에서 부터 4번째 인덱스 부터 탐색
		
		// substring
		System.out.println(str.substring(4, 10));
		
		
		// "첫번째 c에서부터 마지막 c위치까지 문자열
		System.out.println(str.substring(str.indexOf("c"), str.lastIndexOf("c")));
		
		// touppercase
		System.out.println(str.toUpperCase());
		
		
		String[] fileNames = {"abcd.txt", "1234.txt", "abcd.exe", "abcd.bin"};
		
		for(int i = 0; i < fileNames.length; i++) {
			if(fileNames[i].endsWith(".txt")) {
				System.out.println("텍스트 파일 : " + fileNames[i]);
			}
		}
		System.out.println("===============================================");
		for(int i = 0; i < fileNames.length; i++) {
			if(fileNames[i].startsWith("abcd")) {
				System.out.println("abcd로 시작하는 파일 : " + fileNames[i]);
			}
		}
		
		File dir = new File("C:\\Users\\TJ\\workspace_java_jsh");
		System.out.println(dir.isFile());
		System.out.println(dir.isDirectory());
		
		String[] list = dir.list();
		for(String s : list) {
			if(!s.startsWith("lesson")) {
				System.out.println(s);
			}
		}
		System.out.println("===============================================");
		
		
		// 문자열 > 문자열 배열
		String[] strs = "123123123".split("2");//split("구분하는데 사용할 것. 없으면 한개한개를 문자열로 만듬")
		System.out.println(Arrays.toString(strs));
		
		// 문자열 배열 > 문자열
		String str3 = String.join(" + ", strs);
		System.out.println(str3);
		
		
		// 문자열 > 문자 배열
		char[] chs = str.toCharArray();
		for(char c : chs) {
//			System.out.println(c);
		}
		// 문자 배열 > 문자열
		String str2 = new String(chs);
		System.out.println(chs);
		
	}
}
