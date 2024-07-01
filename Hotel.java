import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String name; //hotel Name
    private List<Room> rooms; // Rooms lists
    private List<Person> guests; // Guests List


    public Hotel(String name) {
        this.name = name;
        this.rooms = new ArrayList<>();
        this.guests = new ArrayList<>();
    }

  
