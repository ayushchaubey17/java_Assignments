public class Flight {
      private String flightNumber;
    private String airline;
    private String origin;
    private String destination;
    private int capacity;

    // Static variable
    private static int totalFlights = 0;

    public Flight(String flightNumber, String airline, String origin, String destination, int capacity) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.origin = origin;
        this.destination = destination;
        this.capacity = capacity;
        totalFlights++;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    // Static method
    public static int getTotalFlights() {
        return totalFlights;
    }


    public void displayFlightDetails() {
        System.out.println("Flight Number: " + flightNumber);
        System.out.println("Airline: " + airline);
        System.out.println("Origin: " + origin);
        System.out.println("Destination: " + destination);
        System.out.println("Capacity: " + capacity);
    }
}
