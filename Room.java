public class Room {
    private int roomNumber;
    private RoomType roomType;
    private boolean isOccupied;

    public Room(int roomNumber, RoomType roomType) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.isOccupied = false;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void checkIn() {
        isOccupied = true;
    }

    public void checkOut() {
        isOccupied = false;
    }
}