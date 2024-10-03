public class Room {

    private int roomNumber;
    private String roomType;
    private boolean isAvailable;

    //constructor
    public Room (int roomNumber, String roomType, boolean isAvailable){
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.isAvailable = isAvailable;
    }

    //encapsulation getter and setters
    public int getRoomNumber(){ return roomNumber; }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
    public String getRoomType() {return roomType;}

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }
    public boolean isAvailable() {return isAvailable;}

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    // methods to manipulate the class
    public void displayRoomDetails(){
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Room Type: " + roomType);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }

}
