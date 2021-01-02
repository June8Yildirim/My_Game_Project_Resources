package HotelRoomBooking;

import java.util.ArrayList;

public class Apartment {
    private ArrayList<Oblong> rooms = new ArrayList<Oblong>();

    public boolean add(Oblong Room) {
        return rooms.add(Room);
    }



    public double getRoomLength(int length) {
        for (int i = 0; i < rooms.size() - 1; i++) {
            Oblong tempRoom = rooms.get(i);
            int tempRoomNumber = (int) tempRoom.getLength();
            if (tempRoomNumber == length) {
                return length;
            }
        }
        return -999;
    }

    public double getRoomHeight(int height) {
        for (int i = 0; i < rooms.size() - 1; i++) {
            Oblong tempRoom = rooms.get(i);
            int tempRoomNumber = (int) tempRoom.getLength();
            if (tempRoomNumber == height) {
                return height;
            }
        }
        return -999;
    }
    public double getRoomArea(int roomArea){
        for (int i = 0; i < rooms.size() - 1; i++) {
            Oblong tempRoom = rooms.get(i);
            int tempRoomNumber = (int) tempRoom.calculateArea();
            if (tempRoomNumber == roomArea) {
                return roomArea;
            }
        }
        return -999;
    }
}
