public class BusinessTicket extends Ticket {
    public BusinessTicket(String passengerName, double baseFare) {
        super(passengerName, baseFare);
    }

    @Override
    public double calculateFare() {
        return baseFare * 1.25; // Tambahan 25%
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Class: Business");
        System.out.println("Additional Facilities: Extra baggage limit (30kg), lounge access.");
    }
}
