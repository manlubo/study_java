package lesson05;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class FileDownloader {
	public static void main(String[] args) throws Exception {
		String img = "https://img.suto.co.kr/data/file/free/3024218118_0bl7icGq_0841147752020092540507c61-d3bc-4f18-a8ff-cd36a240ca2f.jpg";
		URL url = new URL(img);
		
		InputStream is = url.openStream();
		FileOutputStream fos = new FileOutputStream("img.jpg");
		
		int b = 0;
		while((b = is.read()) != -1) {
				fos.write(b);
		}
		fos.close();
	}
}
