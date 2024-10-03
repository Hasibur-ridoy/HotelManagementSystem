import java.util.Scanner;

public class HotelManagementSystem {
    public static void main(String[] args) {
        Room room1 = new Room(101, "Single", true);
        Room room2 = new Room(102, "Double", false);
        Room room3 = new Room(103, "Suite", true);

        Staff staff1 = new Staff(1, "John Doe", "Manager");
        Staff staff2 = new Staff(2, "Jane Smith", "Receptionist");
        Staff staff3 = new Staff(3, "Bob Lee", "Cleaner");

        Room[] rooms = { room1, room2, room3 };
        Staff[] staff = { staff1, staff2, staff3 };

        Hotel hotel = new Hotel(rooms, staff);


        System.out.println("Welcome to Grand hotel \n");
        System.out.println("Select your options - ");
        System.out.println("1. Book room");
        System.out.println("2. Cancel Booked room");
        System.out.println("3. Room service");
        System.out.println("4. Order food");

        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();

        switch (i){
            case 1:
                hotel.displayAllRooms();
                System.out.println("1. Book room " + room1.getRoomNumber() + " ,Type: " + room1.getRoomType());
                System.out.println("2. Book room " + room2.getRoomNumber() + " ,Type: " + room2.getRoomType());
                System.out.println("3. Book room " + room3.getRoomNumber() + " ,Type: " + room3.getRoomType());

                System.out.println("Select which room to book - ");
                int selectRoom = scanner.nextInt();
                switch (selectRoom){
                    case 1:
                        hotel.bookRoom(room1.getRoomNumber());
                        hotel.displayAllRooms();
                        break;
                    case 2:
                        hotel.bookRoom(room2.getRoomNumber());
                        hotel.displayAllRooms();
                        break;
                    case 3:
                        hotel.bookRoom(room3.getRoomNumber());
                        hotel.displayAllRooms();
                        break;
                }
                break;
            case 2:

        }
    }
}