package lesson12;

import java.util.Arrays;

public class Ex250421_2 {
	public static void main(String[] args) {
		String url = "https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EA%B3%A0%EC%96%91%EC%9D%B4&ackey=r0f3xf94";
		
//		String protocol = url.substring(0, url.indexOf("://"));
//		System.out.println(protocol);
//		
//		url = url.substring(url.indexOf("://") + "://".length());
////		System.out.println(url);
//		
//		String domain = url.substring(0, url.indexOf("/"));
//		System.out.println(domain);
//		
//		url = url.substring(url.indexOf("/") + "/".length());
//		
////		System.out.println(url);
//		
//		String fileName = url.substring(0, url.indexOf("?"));
//		System.out.println(fileName);
//		
//		url = url.substring(url.indexOf("?") + "?".length());
//		
//		String queryString = url;
//		System.out.println(queryString = url);
		
		MyUrl myUrl = new MyUrl(url);
		System.out.println(myUrl);
	}
}

class MyUrl{
	String protocol;
	String domain;
	String fileName;
	String queryString;
	Param[] params;
// key, value
	
	public MyUrl(String url) {
		protocol = url.substring(0, url.indexOf("://"));
		url = url.substring(url.indexOf("://") + "://".length());
		
		domain = url.substring(0, url.indexOf("/"));
		url = url.substring(url.indexOf("/") + "/".length());
		
		fileName = url.substring(0, url.indexOf("?"));
		url = url.substring(url.indexOf("?") + "?".length());
		
		queryString = url;
		
		String[] tmps = queryString.split("&");
		params = new Param[tmps.length];
		for(int i = 0; i < tmps.length; i++) {
//			System.out.println(tmps[i]);
			String[] t = tmps[i].split("=");
			params[i] = new Param(t[0], t[1]);
		}
	}
	
	
	// code 자주사용되는 기능 > 자동생성  - Source  > 제너레이트 투스트링
	
	
	
	@Override
	public String toString() {
		return String.format("MyUrl %nprotocol : %s %ndomain : %s %nfileName : %s %nparams : %s", protocol, domain,
				fileName, Arrays.toString(params));
	}


	class Param {   // Source > 제네레이트 콘스트럭터 유징 필드
		String key;
		String value;
		public Param(String key, String value) {
			super();
			this.key = key;
			this.value = value;
		}
		@Override
		public String toString() {
			return String.format("[%s, %s]", key, value);
		}
		
		
	}
	
	
}
