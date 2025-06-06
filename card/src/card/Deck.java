package card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
//	Card[] cards = new Card[52];
	
	List<Card> cards = new ArrayList<Card>();
	{	
		Kind[] kinds = Kind.values();
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 13; j++) {
				cards.add(new Card(kinds[i], j)); 
			}
		}
	}
	
	Deck print() {
		for (Card c : cards) {
			System.out.println(c);
		}
		return this;
	}
	
	
	
	Deck shuffle() {
//		for(int i = 0; i < cards.size(); i++) {
//			int r = (int)(Math.random() * 52);
//			Card tmp = cards.get(i);
//			cards.set(i, cards.get(r));
//			cards.set(r, tmp);
//		}
		Collections.shuffle(cards);
		return this;
	}
	
	
	
	Card pick() {
		return cards.remove(cards.size()-1);
	}
	
	
	
	public static void main(String[] args) {
		new Deck().shuffle().print();
	}
}
