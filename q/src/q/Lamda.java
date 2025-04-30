package q;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntFunction;

public class Lamda {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("김길동이");
		list.add("김길이");
		list.add("길동이");
		list.add("이길동이");
		
		
		
		
		
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).length() >= 4) {
				System.out.println(list.get(i));
				
			}
		}
		
	}
}
