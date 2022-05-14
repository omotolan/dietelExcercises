package RoomC9;

public class Room {
    private Ac ac;
    private Mattress mattress;
    private Chair chair;
    private WorkStation workStation;

    public Room(Ac ac, Mattress mattress, Chair chair, WorkStation workStation) {
        this.ac = ac;
        this.mattress = mattress;
        this.chair = chair;
        this.workStation = workStation;
    }

    public void roomFeatures(){
        System.out.println(getMattress().getBrand());
        System.out.println(getChair().getSize());
        System.out.println(getWorkStation().getLaptop());

    }

    private Ac getAc() {
        return ac;
    }

    private Mattress getMattress() {
        return mattress;
    }
    public void setMattress(Mattress mattress){
        this.mattress = mattress;
    }

    private Chair getChair() {
        return chair;
    }

    private WorkStation getWorkStation() {
        return workStation;
    }
}
