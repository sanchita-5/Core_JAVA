class Runway {
    synchronized void useRunway(String flight, String operation) {
        System.out.println(flight + " is requesting for " + operation + ".");
        System.out.println(flight + " completed " + operation + ".");
    }
}

class Flight extends Thread {
    Runway runway;
    String flightName, operation;

    Flight(Runway r, String name, String op) {
        this.runway = r;
        this.flightName = name;
        this.operation = op;
    }

    public void run() {
        runway.useRunway(flightName, operation);
    }
}

public class Q2 {
    public static void main(String[] args) {
        Runway runway = new Runway();
        new Flight(runway, "AI101", "landing").start();
        new Flight(runway, "SG202", "takeoff").start();
    }
}
