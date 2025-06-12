// Simulated packages in one file
class Flight {
    String flightNumber = "AI123";
    String destination = "Delhi";
    double price = 5000;

    void getDetails() {
        System.out.println("Flight: " + flightNumber + ", Destination: " + destination + ", ₹" + price);
    }
}

class Hotel {
    String hotelName = "Grand Hotel";
    String location = "Delhi";
    double price = 3000;

    void getDetails() {
        System.out.println("Hotel: " + hotelName + ", Location: " + location + ", ₹" + price);
    }
}

class Booking {
    void bookFlight(Flight f) {
        System.out.print("Flight Booked - ");
        f.getDetails();
    }

    void bookHotel(Hotel h) {
        System.out.print("Hotel Booked - ");
        h.getDetails();
    }
}

public class Q7 {
    public static void main(String[] args) {
        Flight f = new Flight();
        Hotel h = new Hotel();
        Booking b = new Booking();
        b.bookFlight(f);
        b.bookHotel(h);
    }
}
