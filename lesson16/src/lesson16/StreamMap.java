package lesson16;

import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMap {
	public static void main(String[] args) {
		//학생타입의 list
		// List<Student> >> Stream<Student>
		// Stream<Student> >> Stream<Integer>
		
		List<Student> students = List.of(new Student("새똥이", 100),new Student("개똥이", 70),new Student("말똥이", 80));
		System.out.println(students);
		
		Stream<Student> stream = students.stream(); // 학생타입을 스트림 형태로 변경
		
		IntStream stream2 = stream.mapToInt(s -> s.score);
//		stream.map(s -> s.score).forEach(s -> System.out.println(s));
//		stream2.forEach(System.out::println); // 하나 넣고 그대로 뽑으니까 람다식 생략
		int sum = stream2.sum();
		
		System.out.println(sum);
	}
}

class Student {
	String name;
	int score;
	public Student(String name, int score) {
	
		this.name = name;
		this.score = score;
	}
	@Override
	public String toString() {
		return String.format("[name=%s, score=%s]", name, score);
	}
	
	
}
