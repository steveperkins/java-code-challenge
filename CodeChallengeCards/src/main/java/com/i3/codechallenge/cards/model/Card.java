package com.i3.codechallenge.cards.model;

import java.util.HashMap;
import java.util.Map;

import com.i3.codechallenge.exception.NotImplementedException;

public class Card {
	private static final Map<Integer, String> CARD_NAMES = new HashMap<Integer, String>();
	static {
		CARD_NAMES.put(1, "Ace");
		CARD_NAMES.put(11, "Jack");
		CARD_NAMES.put(12, "Queen");
		CARD_NAMES.put(13, "King");
	}
	
	private Suit suit; 
	private Integer number;
	public Card(Suit suit, Integer number) {
		this.suit = suit;
		this.number = number;
	}
	public Suit getSuit() {
		throw new NotImplementedException();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Card))
			return false;
		Card card = (Card)obj;
		return this.suit.equals(card.suit) && this.number.equals(card.number);
	}
	
	@Override
	public String toString() {
		int cardValue = number;
		String cardName = String.valueOf(cardValue);
		if(CARD_NAMES.containsKey(cardValue)) {
			cardName = CARD_NAMES.get(cardValue);
		}
		return cardName + " of " + suit.toString();
	}
}
