package HotelRoomBooking;

public class Oblong {

    private double length;
    private double height;

    public Oblong(double length, double height) {
        this.length = length;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateArea() {return this.height * this.length;}

    public double calculatePerimeter() {return 2 * (this.height + this.length);
    }
}
