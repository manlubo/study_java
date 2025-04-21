package lesson12;

import java.util.Arrays;

public class Ex250421 {
	public static void main(String[] args) {
		String url = "https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EA%B3%A0%EC%96%91%EC%9D%B4&ackey=r0f3xf94";
		// 프로토콜://도메인/파일명?쿼리스트링
		// 1. 위 항목에 맞춰 문자열 자르기
		
		// where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EA%B3%A0%EC%96%91%EC%9D%B4&ackey=r0f3xf94"
		// 쿼리스트링은 키1=값1%키2=값2
		// 즉 값의 쌍은 &로 구분, 키와 값은 =로 구분
		
		String[] urls = url.split("://");
		String protocol = urls[0]; 
		System.out.println("프로토콜 : " + protocol);
		url = urls[1];
		urls = url.split("/");
		String domain = urls[0];
		System.out.println("도메인 : " + domain);
		url = urls[1];
//		System.out.println(url);
		
		String fileName = url.substring(0,url.indexOf("?"));;
		System.out.println("파일 이름 : " + fileName);
		url = url.substring(url.indexOf("?"));
		url = url.substring(1);
//		System.out.println(url);
		
		
		urls = url.split("&");
		
//		System.out.println(urls.length);
		
		String[][] quarry = new String[urls.length][2];
		for(int i = 0; i < urls.length; i++) {
			for(int j = 0; j < 2; j ++) {
				if(j == 0) {
					quarry[i][j] = urls[i].substring(0,urls[i].indexOf("="));
				}
				if(j == 1) {
					quarry[i][j] = urls[i].substring(urls[i].indexOf("=") + 1);
				}
			}
		}
		int count = 1;
		for(int i = 0; i < urls.length; i++) {
			System.out.println(count++ + "번 쿼리 : " + Arrays.toString(quarry[i]));
		}
		
		
		
		
		
		
	}
}
