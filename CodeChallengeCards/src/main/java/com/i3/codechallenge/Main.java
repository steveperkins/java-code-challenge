package com.i3.codechallenge;

import com.i3.codechallenge.cards.model.Game;

public class Main {
	public static void main(String[] args) {
		/*
		 * This is the card game War with some alternate rules to simplify the exercise.
		 * 1. There are only two players and the cards are always dealt to players in the same order. Player 1 will always first receive 
		 * 	the Ace of Spades, Player 2 always gets the 2 of Spades, Player 1 will always get the 3 of Spades, etc.
		 *  The cards are in modified new deck order, where the next suit always starts with Ace and goes to King.
		 *  Ace = 1, Jack = 11, Queen = 12, King = 13
		 * 
		 * 2. For each hand, a player plays the next card in his stack. The player with the highest card wins the hand.
		 * 
		 * 3. Only one round is played. That is, the game continues until a total of 52 cards have been played. 
		 * 
		 * 4. Once you're done with War, you'll be asked to implement Beggar's War, where the player with the lowest card wins the hand.
		 * 
		 * The programming objectives of this exercise are:
		 * 1. Build the game so it can be played by making function calls on the Game object.
		 * 2. Print the cards played and the winning player after each hand.
		 * 3. After 52 cards have been played, print the player who won the most hands.
		 * 
		 * The evaluation objectives of this exercise are to determine your:
		 * 1. Level of comfort with designing and implementing object-oriented systems
		 * 2. Learning process
		 * 3. Problem-solving process
		 * 4. Coding style
		 */
		Game game = new Game();
		
		
	}
}
