import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String name; //hotel Name
    private List<Room> rooms; // Rooms lists
    private List<Person> guests; // Guests List
    private Bank bank; // Bank amount

    public Hotel(String name, Bank bank) {
        this.name = name;
        this.bank = bank;
        this.rooms = new ArrayList<>();
        this.guests = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void checkInGuest(Person person, int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber && !room.isOccupied()) {
                room.checkIn();
                guests.add(person);
                System.out.println(person.getName() + " checked into room " + roomNumber);
                return;
            }
        }
        System.out.println("Room " + roomNumber + " is not available.");
    }

    public void checkOutGuest(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber && room.isOccupied()) {
                room.checkOut();
                System.out.println("Room " + roomNumber + " is now available.");
                return;
            }
        }
        System.out.println("Room " + roomNumber + " is not occupied.");
    }

    public List<Room> getAvailableRooms() {
        List<Room> availableRooms = new ArrayList<>();
        for (Room room : rooms) {
            if (!room.isOccupied()) {
                availableRooms.add(room);
            }
        }
        return availableRooms;
    }
}
