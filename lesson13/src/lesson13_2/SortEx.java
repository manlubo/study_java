package lesson13_2;

import java.util.Set;
import java.util.TreeSet;

public class SortEx {
	public static void main(String[] args) {
		String str1 = "AA";
		String str2 = "AB";
		
		System.out.println(str1.compareTo(str2));
		
		Integer i = 10;
		System.out.println(Integer.compare(10, 20));
		
		
		Set<Data> set = new TreeSet<>();
		set.add(new Data(5, "A"));
		set.add(new Data(3, "A"));
		set.add(new Data(1, "A"));
		set.add(new Data(2, "A"));
		set.add(new Data(4, "A"));
		
		System.out.println(set);
	}
	

}
class Data implements Comparable<Data>{
	int i;
	String name;
	
	
	public Data(int i, String name) {
		super();
		this.i = i;
		this.name = name;
	}

	@Override
	public int compareTo(Data o) {
		// TODO Auto-generated method stub
		// i값을 기준으로 오름차순
		// i값이 같을 시 name값 내림차순
		int ret = 0;
		ret = i - o.i;
		if(ret == 0) {
			return name.compareTo(o.name);
		}
		return ret;
	}

	@Override
	public String toString() {
		return String.format("Data [i=%s, name=%s]", i, name);
	}
	
	
	
}
