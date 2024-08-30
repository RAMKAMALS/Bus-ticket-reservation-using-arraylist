package BusReservation;

public class Bus {
    private int busno;
    private boolean ac;
    private int capacity;

    Bus(int no, boolean ac, int cap) {
        this.busno = no;
        this.ac = ac;
        this.capacity = cap;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int cap) {
        capacity = cap;
    }

    public int getBusNo() {
        return busno;
    }

    public void setBusNo(int no) {
        busno = no;
    }

    public boolean isAc() {
        return ac;
    }

    public void setAc(boolean val) {
        ac = val;
    }

    public void displayBusInfo() {
        System.out.println("Bus No: " + busno + "  AC: " + (ac ? "Yes" : "No") + "  Total Capacity: " + capacity);
    }
}
