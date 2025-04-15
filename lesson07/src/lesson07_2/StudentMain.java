package lesson07_2;

public class StudentMain {
	public static void main(String[] args) {
		Student student = new Student(); 
//		Student.java에서 Student 생성자를 사용했고, 들어갈 타입을 정해두었기 때문에 그냥 생성이
//		불가능하고, 오버로딩을 이용해 컴파일러가 자동으로 생성자를 만들어주게 할 수 있다.
//		.java(src) > 컴파일 > .class(bin) > 인터프리트(JVM) > 프로세스
//				  < 디컴파일 <			
		
		Student stu = new Student("홍길동", 4, "소프트웨어공학");
		
		System.out.println(stu.name);
		System.out.println(stu.grade);
		System.out.println(stu.department);
		
		
		Student stu2 = new Student("이순신", 3, "디자인");
		
		System.out.println(stu2.name);
		System.out.println(stu2.grade);
		System.out.println(stu2.department);
	}
}
