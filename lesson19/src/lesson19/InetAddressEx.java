package lesson19;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {
	public static void main(String[] args) {
		try {
		InetAddress ip = InetAddress.getByName("www.naver.com"); // 아이피 개체 생성 하면
		System.out.println("hostname : " + ip.getHostName()); // 호스트 네임과
		System.out.println("ip : " + ip.getHostAddress()); // 호스트 주소 알 수 있음
		
		InetAddress[] ips = InetAddress.getAllByName("www.naver.com"); // 호스트 명에 붙어있는 모든 주소를 가져온다
		for(InetAddress i : ips) {
			System.out.println("ip 주소 :" + i);
		}
		
		byte[] ipAddr = ip.getAddress(); // 배열타입으로 나옴
		
		for(byte b : ipAddr) {
			System.out.print(((b < 0) ? b + 256 : b) + ".");
		}
		System.out.println();
		InetAddress local = InetAddress.getLocalHost(); 
		System.out.println("내 컴퓨터 IP : " + local);
		
		InetAddress ip2 = InetAddress.getByAddress(ips[0].getAddress());
		System.out.println(ips[0].getHostAddress() + " 주소 : " + ip2);
		}
		catch (UnknownHostException e) {
			System.out.println(e.getMessage());
		}
	}
	
}
