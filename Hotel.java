public class Hotel {

    private Room[] rooms;
    private Staff[] staffs;

    //constructor
    public Hotel(Room[] rooms, Staff[] staff){
        this.rooms = rooms;
        this.staffs = staff;
    }

    //method
    public void displayAllRooms(){
        System.out.println("Room details: ");
        for (Room room : rooms){
            room.displayRoomDetails();
            System.out.println();
        }
    }

    public void displayAllStaffs(){
        System.out.println("Staff details: ");
        for (Staff staff : staffs){
            staff.displayStaffDetails();
            System.out.println();
        }
    }

    public void bookRoom(int roomNumber){
        boolean roomFound = false;
        for (Room room : rooms){
            if (room.getRoomNumber() == roomNumber){
                roomFound = true;
                if (room.isAvailable()){
                    room.setAvailable(false);
                    System.out.println("Room: " + roomNumber + " has been booked successfully");
                } else {
                    System.out.println("Room: " + roomNumber + "is already booked");
                }
                break;
            }
        }
        if (!roomFound){
            System.out.println("Room: " + roomNumber + "not found");
        }
    }

    public void cancelBookRoom(int roomNumber){
        boolean roomFound = false;
        for(Room room : rooms){
            if (room.getRoomNumber() == roomNumber){
                roomFound = true;
                if (!room.isAvailable()) {
                    room.setAvailable(true);
                    System.out.println("Room: " + roomNumber + " canceled booking ");
                } else {
                    System.out.println("Room: " + roomNumber + " is not currently booked ");
                }
            }
        }
        if (!roomFound){
            System.out.println("Room: " + roomNumber + " not found ");
        }
    }
}
