package lesson18;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BrEx {
	public static void main(String[] args) throws Exception {
		// 특정 파일을 문자기반 스트림
		FileReader fr = new FileReader("output2.txt");
		// 버퍼기반의 보조 스트림 사용
		BufferedReader br = new BufferedReader(fr);
//		String str = br.readLine();
//		System.out.println(str);
//		str = br.readLine();
//		System.out.println(str);
//		str = br.readLine();
//		System.out.println(str);
//		str = br.readLine();
//		System.out.println(str);
		String s;
		while((s = br.readLine()) != null) {
			System.out.println(s);
		}
		
		br.close();
		
		// 문자 <> 바이트
		FileInputStream fis = new FileInputStream("output2.txt");
		InputStreamReader isr = new InputStreamReader(fis); // 외부에서 입력되는게 바이트 > 문자로 입력
		BufferedReader b2 = new BufferedReader(isr);
		
		
		
		
		OutputStreamWriter osw; // 출력 시 문자 > 바이트로 입력
	}
}
