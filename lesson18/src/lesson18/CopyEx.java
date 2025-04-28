package lesson18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class CopyEx {
	// output2.txt 파일을 output3.txt 파일로 복사
	// FileInputStream, FileOutputStream 사용
	 
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("output2.txt");
		FileOutputStream fos = new FileOutputStream("output3.txt");
//		fos.write(fis.readAllBytes()); // 인트타입이라 21억개 넘어가면 못함
		
//		int b = 0;
//		while ((b = fis.read()) != -1) {
//			fos.write(b); 			
//		}

		byte[] bs = new byte[10];
		int length = 0;
		while((length = fis.read(bs)) != -1) {
			fos.write(bs, 0, length);
		}
		fis.close();
		fos.close();
		
		
	}
	
}
