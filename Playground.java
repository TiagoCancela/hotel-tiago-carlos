import java.util.ArrayList;
import java.util.List;

public class Playground {

    public static void main(String[]args){
            RoomType Single = new RoomType(Single, 100);
            RoomType Double = new RoomType(Double, 150);
            RoomType Suite = new RoomType(Suite, 250);

            System.out.println("name " + RoomType.getname() + " price=" + RoomType.getPrice());

            Room 101 = new Room(101, Single);
            Room 102 = new Room(102, Single);
            Room 103 = new Room(103, Suite);
            Room 104 = new Room(104, Suite);

            List<Room> rooms = new ArrayList<>();
            rooms.add(101);
            rooms.add(102);
            rooms.add(103);
            rooms.add(104);

            for (Room Room : rooms) {

                System.out.println("Quarto" + room.getRoomNumber() +" " + room.getRoomType() +  "- Ocupado" + room.isOcuppied());

    }
}
