package q;

import java.util.ArrayList;
import java.util.List;

public class Lamda {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("김길동이");
		list.add("김길이");
		list.add("길동이");
		list.add("이길동이");
		
		
		
		
		System.out.println(list);
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).length() >= 4) {
				System.out.println(list.get(i));
				
			}
		}
		
	}
}
