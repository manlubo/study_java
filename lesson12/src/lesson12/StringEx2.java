package lesson12;

public class StringEx2 {
	public static void main(String[] args) {
		String str = "";
		long start = System.currentTimeMillis();
		// 1970. 1. 1. 00:00:00 시작 - 현재까지 흘러간 ms
		System.out.println(start + "ms");
//		for(int i = 0; i < 300000; i++) {
////			str += "0";
//		}
		long end = System.currentTimeMillis();
//		System.out.println(end + "ms");
//		System.out.println(str.length());
//		System.out.println(end - start + "ms");
		
		
		StringBuffer sb = new StringBuffer();
		start = System.currentTimeMillis();
		for(int i = 0; i < 300000; i++) {
			sb.append("0");			
		}
		end = System.currentTimeMillis();
		System.out.println(end - start + "ms");
		
		// String > StringBuffer
		StringBuffer sb2 = new StringBuffer(str);
		// StringBuffer > String
		String str2 = sb2.toString();
	}
}
