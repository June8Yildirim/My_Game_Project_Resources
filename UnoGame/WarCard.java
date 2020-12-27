package UnoGame;

public class WarCard {
    private int suit;

    private int card;

    public WarCard(int suit, int card) {
        super();
        this.suit = suit;
        this.card = card;
    }

    public int getCard() {
        return card;
    }

    public void setCard(int card) {
        this.card = card;
    }

    @Override
    public String toString() {

        StringBuilder result = new StringBuilder();
        switch (card) {
            case 11:
                result.append("Jack");
                break;
            case 12:
                result.append("Queen");
                break;
            case 13:
                result.append("King");
                break;
            case 14:
                result.append("Ace");
                break;
            default:
                result.append(card);
        }
        result.append(" of ");
        switch (suit) {
            case 0:
                result.append("hearts");
                break;
            case 1:
                result.append("diamonds");
                break;
            case 2:
                result.append("clubs");
                break;
            case 3:
                result.append("spades");
                break;
        }
        return result.toString();

    }

}


