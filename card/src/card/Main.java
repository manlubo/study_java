package card;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
//		Card card = new Card(Kind.CLOVER, 0);
//		Kind kind = Kind.DIAMOND;
//		Kind kind2 = Kind.HEART;
//		card.kind = Kind.SPADE;
//		System.out.println(card);
//		System.out.println(card.kind);
//		System.out.println(kind.ordinal());
//		System.out.println(kind == kind2);
//		System.out.println(kind.score());
//		System.out.println(kind2.score());
//		System.out.println(kind.getName());
//		System.out.println(kind2.getName());
		play();
		
	}
	
	static void play() {
		List<Player> players = new ArrayList<Player>();
		Deck deck = new Deck();
		deck.shuffle();
		players.add(new Player("새똥이"));
		players.add(new Player("개똥이"));
		players.add(new Player("소똥이"));
		players.add(new Player("말똥이"));
		
		
		for(int i = 0; i < players.size(); i++) {
			for(int j = 0; j < 5; j++) {
				players.get(i).cards.add(deck.pick());
			}
		}
		
		
		
		for(Player p : players) {
			System.out.println(p);
		}
		
		
		System.out.println("deck의 남은 카드 갯수 : " + deck.cards.size());
	}
}
