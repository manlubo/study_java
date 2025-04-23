package lesson14;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BoxMain {
	public static void main(String[] args) {
		Box<String> box = new Box<>();
		box.setItem("양말");
		box.setItem("고깔");
		System.out.println(box.getItem());
		
		Box<Integer> box2 = new Box<>();
		box2.setItem(10);
		System.out.println(box2.getItem());
		
		Comparator<Object> comp = (a, b) -> 0;
		List<Integer> list = new ArrayList<Integer>();
		list.sort(comp);
	}
	
	
}
class Box<T> {
	private T Item;

	public T getItem() {
		return Item;
	}

	public void setItem(T item) {
		Item = item;
	}
	
	
	
	
}
