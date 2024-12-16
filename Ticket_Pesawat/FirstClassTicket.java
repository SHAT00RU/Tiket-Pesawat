public class FirstClassTicket extends Ticket {
    public FirstClassTicket(String passengerName, double baseFare) {
        super(passengerName, baseFare);
    }

    @Override
    public double calculateFare() {
        return baseFare * 1.5; // Tambahan 50%
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Class: First Class");
        System.out.println("Additional Facilities: Unlimited baggage, luxury lounge access, premium meals.");
    }
}
