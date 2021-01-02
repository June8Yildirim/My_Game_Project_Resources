package HotelRoomBooking;

public class Booking {
    private String roomNumber;
    private String lectureName;

    public Booking(String roomNumber, String lectureName) {
        this.roomNumber = roomNumber;
        this.lectureName = lectureName;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public String getLectureName() {
        return lectureName;
    }
}
