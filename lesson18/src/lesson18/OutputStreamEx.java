package lesson18;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class OutputStreamEx {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos2 = new FileOutputStream("output2.txt",true);
//		fos.write('A');
//		fos.write('B');
//		fos.write('C');
//		
//		
//		byte[] bs = {' ', 48, 49, 50, 51};
//		fos.write(bs);
//		
//		fos.write(13);
//		fos.write(10);
//		fos.write(97);
//		fos.write(98);
//		fos.write(99);
//		fos.close();
		
	
		
		for(int i = 'A'; i <= 'Z'; i++) {
			fos2.write(i);
		}
		fos2.write(10);
		for(int i = 'a'; i <= 'z'; i++) {
			fos2.write(i);
		}
		fos2.write(10);
		for(int i = '0'; i <= '9'; i++) {
			fos2.write(i);
		}
		
		
		// A-Z의 문자들을 첫줄에 표현
		// a-z 문자들을 첫줄에 표현
		// 0-9의 문자는 셋째쭐
		// 개행문자는 /n만 사용
	}
}
