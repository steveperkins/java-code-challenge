package com.i3.codechallenge.cards;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.i3.codechallenge.cards.model.Card;
import com.i3.codechallenge.cards.model.Suit;

public class CardFactoryTest {

	@Test
	public void testNewDeckHasAllCards() {
		List<Card> deck = CardFactory.newDeck();
		assertEquals(52, deck.size());
		
		for(Suit suit: Suit.values()) {
			for(int i = 1; i <= 13; i++) {
				assertTrue("Deck is missing " + i + " of " + suit.toString(), deck.contains(new Card(suit, i)));
			}
		}
	}

}
