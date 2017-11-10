package com.i3.codechallenge.cards.model;

import com.i3.codechallenge.exception.NotImplementedException;

public class Card {
	Suit suit; Number number;
	public Card(Suit suit, Number number) {
//		throw new NotImplementedException();
		this.suit = suit;this.number = number;
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
}
