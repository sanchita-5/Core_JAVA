class TicketCounter {
    int availableSeats = 3;

    synchronized boolean bookTicket(String name, int seats) {
        if (availableSeats >= seats) {
            System.out.println(name + " booked " + seats + " seat(s).");
            availableSeats -= seats;
            return true;
        } else {
            System.out.println(name + " failed to book. Not enough seats.");
            return false;
        }
    }
}

class Passenger extends Thread {
    TicketCounter counter;
    String name;
    int seats;

    Passenger(TicketCounter counter, String name, int seats) {
        this.counter = counter;
        this.name = name;
        this.seats = seats;
    }

    public void run() {
        counter.bookTicket(name, seats);
    }
}

public class Q1 {
    public static void main(String[] args) {
        TicketCounter counter = new TicketCounter();
        new Passenger(counter, "Alice", 2).start();
        new Passenger(counter, "Bob", 2).start();
    }
}
