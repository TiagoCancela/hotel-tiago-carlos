public class Room {
    private int roomNumber; 
    private RoomType roomType;  // calling out RoomType, this class depends on RoomType for the 
    private boolean isOccupied; // Boolean for a true or false isOccupied

    public Room(int roomNumber, RoomType roomType) {
        this.roomNumber = roomNumber; // assigning this room a number, a type and its not occupied
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
        isOccupied = true; // when we check in, the isOccupied turns true
    }

    public void checkOut() {
        isOccupied = false; // 
    }
}
