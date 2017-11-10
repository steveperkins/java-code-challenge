package com.i3.codechallenge.cards;

import java.util.LinkedList;
import java.util.List;

import com.i3.codechallenge.cards.model.Card;
import com.i3.codechallenge.cards.model.Suit;

public class CardFactory {
	/**
	 * Generates a pristine deck of cards in numeric order by suit
	 * @author steve.perkins
	 *
	 */
	public static List<Card> newDeck() {
		List<Card> cards = new LinkedList<Card>();
		for(Suit suit: Suit.values()) {
			for(int i = 1; i <= 13; i++) {
				cards.add(new Card(suit, i));
			}
		}
		return cards;
	}
}
