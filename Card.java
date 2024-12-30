/**
   Chapter 18, Programming Challenge 6
   Card Class
*/

public class Card
{
   // Constants for suits
   public final static int HEARTS = 0;
   public final static int DIAMONDS = 1;
   public final static int SPADES = 2;
   public final static int CLUBS = 3;
   
   // Constants for face values
   public final static int JOKER = 0;
   public final static int ACE = 1;
   public final static int TWO = 2;
   public final static int THREE = 3;
   public final static int FOUR = 4;
   public final static int FIVE = 5;
   public final static int SIX = 6;
   public final static int SEVEN = 7;
   public final static int EIGHT = 8;
   public final static int NINE = 9;
   public final static int TEN = 10;
   public final static int JACK = 11;
   public final static int QUEEN = 12;
   public final static int KING = 13;
   
   // Array of printable face value names
   private static String[] valueNames = 
       { "Joker", "Ace", "Two", "Three", "Four",
         "Five", "Six", "Seven", "Eight", "Nine",
         "Ten", "Jack", "Queen", "King" };
   
   // Array of printable suit names
   private static String[] suitNames =
       { "Hearts", "Diamonds", "Spades", "Clubs" };
   
   // Instance fields for face value and suit
   private int value;
   private int suit;
   
   /**
      Constructor
      @param faceValue An integer representing the card's
             face value.
      @param cardSuit An integer representing the card's
             suit.
      @throws IllegalArgumentException when faceValue or
              cardSuit are set to illegal values.
   */
   
   public Card(int faceValue, int cardSuit)
   {
      // Validate the face value.

      
      // Validate the suit.

   }
   
   /**
      getFaceValue method
      @return An integer representing the card's
              face value.
   */
   
   public int getFaceValue()
   {

   }
   
   /**
      getSuit method
      @return An integer representing the card's
              suit.
   */
   
   public int getSuit()
   {

   }
   
   /**
      toString method
      @return A String representing the suit and
              face value of the card.
   */
   
   public String toString()
   {

   }
}