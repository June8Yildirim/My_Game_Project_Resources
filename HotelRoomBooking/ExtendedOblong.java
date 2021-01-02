package HotelRoomBooking;

public class ExtendedOblong extends Oblong {
    private char symbol;

    public ExtendedOblong(double length, double height, char symbol) {
        super(length, height);
        this.symbol = symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public String draw() {
        String s = new String(); // start off with an empty string
        int l, h;
        l = (int) getLength();
        h = (int) getHeight();
        for (int i = 1; i <= h; i++)
        {
            for (int j = 1; j <= l; j++)
            {
                s = s + symbol; // add a symbol to end of the string
            }
            s = s + '\n'; // add a new line to the string
        }
        return s;
    }
}
