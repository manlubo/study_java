package card;

public class Card {
	int number; // 2, 3, 4 ... 10, J, Q, K, A
	int kind; // SPADE, DIAMOND, HEART, CLOVER
	
	Card(int kind, int number){
		this.kind = kind;
		this.number = number;
	}
	
	public String toString() {
		// 10, 2
		String numbers = "23456789XJQKA";
		String kinds = "♣♥◆♠";
		return "[ " + kinds.charAt(kind) + " , " + numbers.charAt(number) + " ]";
	}
}
