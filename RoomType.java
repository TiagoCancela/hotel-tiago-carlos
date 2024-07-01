public class RoomType {
        private String name; // assigning a name to the Room, needs to be "String" for names
        private int price; // assigning a price to the Room, "int" are Integers (numeros inteiros)

        public RoomType(String name, int price) {
                this.name = name; // To create this room
                this.price = price; // with this price
        }

        public String getname() {
                return name;
        }

        public int getprice() {
                return price;
        }
}





