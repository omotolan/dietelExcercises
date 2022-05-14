package RoomC9;

public class RoomDriver {
    public static void main(String[] args) {
        Mattress mattress = new Mattress("mouka", 9);
        Ac ac = new Ac("thermocool", "wall");
        Chair chair = new Chair("4 sitter", "green");
        WorkStation workStation = new WorkStation("wooden", "dell latitude", "dell");

        Room myRoom = new Room(ac, mattress, chair, workStation );
        Mattress mattress1 = new Mattress("vita foam", 5);
        Room myRoom1 = new Room(ac,mattress,chair, workStation );

        //System.out.println(myRoom.getAc().getBrand());

        myRoom1.setMattress(mattress1);
       // System.out.println(myRoom1.getMattress().getBrand());
       myRoom1.roomFeatures();
        System.out.println();
    }
}
