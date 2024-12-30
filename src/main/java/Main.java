/**
   Chapter 18, Programming Challenge 6
   CardDealer class
*/

public class Main
{
   public static void main(String[] args)
   {
      // Create a CardPlayer.
      CardPlayer player = new CardPlayer();


      // Create a deck of cards.
      Deck deck = new Deck();

      // The Deck constructor shuffles the cards,
      // but let's shuffle them again...
      deck.shuffle();

      // Deal five cards to the player.
      for (int count = 1; count <= 5; count++)
         player.getCard(deck.deal());

      // Let's see the player's cards.
      player.showCards();
   }
}
