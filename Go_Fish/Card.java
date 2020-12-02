public class Card
{
   private int _suit, _value;
   public Card(int value,int suit)
   {
      _value = value;
      _suit = suit;
   }
   public String toString()
   {
      String value = "";
      if(_value > 10)
      {
         switch(_value)
         {
            case 11:
               value = "Jack of ";
               break;
            case 12:
               value = "Queen of ";
               break;
            case 13:
               value = "King of ";
               break;
         }
       }else if(_value == 1)
       {
         value = "Ace of ";
       }else
         value = "" + _value + " of ";
       String suit = "";
       if(_suit >= 1 && _suit <= 4)
       {
         switch(_suit)
         {
            case 1:
               suit = "Clubs";
               break;
            case 2:
               suit = "Diamonds";
               break;
            case 3:
               suit = "Hearts";
               break;
            case 4:
               suit = "Spades";
               break;
         }
       }
       return value + suit;
          
   }
   public int getSuit()
   {
      return _suit;
   }
   public int getValue()
   {
      return _value;
   }

}