package q;

import java.util.HashMap;
import java.util.Map;

public class Generic2Ex {

}
class MyBox<T, T2>{
	Map<T,T2> map = new HashMap<>();
	
	T2 get(T t) {
		return map.get(t);
	}
	
	void put(T t, T2 t2) {
		map.put(t, t2);
	}
}
