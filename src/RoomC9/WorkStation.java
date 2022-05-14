package RoomC9;

public class WorkStation {
    private String table;
    private String laptop;
    private String monitor;

    public WorkStation(String table, String laptop, String monitor) {
        this.table = table;
        this.laptop = laptop;
        this.monitor = monitor;
    }

    public String getTable() {
        return table;
    }

    public String getLaptop() {
        return laptop;
    }

    public String getMonitor() {
        return monitor;
    }
}
