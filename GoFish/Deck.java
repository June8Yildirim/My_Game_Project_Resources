package GoFish;
import java.util.Random;

public class Deck
{
    private int _count;
    private Card[] _hand;
    private static final int Storage = 52;
    private static Random random = new Random();
    public Deck()
    {
        _hand = new Card[Storage];
        _count = 0;
    }

    public void fillDeck()
    {
        Card card;
        for(int i = 1; i <= 4; i++)
        {
            for(int j = 1; j <= 13; j++)
            {
                card = new Card(j,i);
                this.insertCard(card);
            }
        }
    }

    public void insertCard(Card card)
    {
        if(_count == _hand.length)
        {
            Card[] _temp = new Card[_count + Storage];
            for(int i = 0; i < _hand.length; i++)
            {
                _temp[i] = _hand[i];
            }
            _hand = _temp;
        }
        _hand[_count] = card;
        _count++;
    }
    public Card deleteValue(int value)
    {
        Card temp;
        Card deleted;
        for(int i = 0; i<_count; i++)
        {
            temp = _hand[i];
            if(temp.getValue() == value)
            {
                deleted = temp;
                _hand[i] = _hand[_count-1];
                _count--;
                return deleted;
            }
        }
        return null;
    }
    public Card deleteAnyCard()
    {
        if(_count == 0)
        {
            return null;
        }else
        {
            int randoIx = random.nextInt(_count);
            Card temp = _hand[randoIx];
            if(randoIx != _count-1)
            {
                _hand[randoIx] = _hand[_count-1];
                _count--;
            }else
            {
                _hand[_count-1] = null;
                _count--;
            }
            return temp;
        }
    }
    public int checkBookBegginingDeal() //CHECKS FOR BOOK ON OPENING DEAL
    {
        for(int i = 0; i<4 ; i++)
        {
            if(getCount(_hand[i].getValue()) == 4)
            {
                return _hand[i].getValue();
            }
        }
        return 0;
    }
    public int getCount(int value)
    {
        int occurences = 0;
        for(int i = 0; i<_count;i++)
        {
            if(_hand[i].getValue() == value)
            {
                occurences++;
            }
        }
        return occurences;
    }
    public int getSize()
    {
        return _count;
    }
    public String toString()
    {
        if(_count != 0)
        {
            String result = "User Deck: \n";
            for(int i = 0; i<_count; i++)
            {
                result = result + _hand[i] + "\n";
            }
            return result;
        }
        return "Empty Hand";
    }
}