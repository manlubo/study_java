package q;

public class Book {
	String bookName;
	String writerName;
	
	Book(){}
	Book(String b, String w){
		this.bookName = b;
		this.writerName = w;
	}
	
	void printInfo() {
		System.out.println("책이름 : " + bookName + "\n저자 : " + writerName);
	}
	public static void main(String[] args) {
		Book book = new Book("개미", "베르나르베르베르");
		book.printInfo();
	}
}
