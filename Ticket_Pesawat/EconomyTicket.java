public class EconomyTicket extends Ticket {
    public EconomyTicket(String passengerName, double baseFare) {
        super(passengerName, baseFare);
    }

    @Override
    public double calculateFare() {
        return baseFare * 0.9; // Diskon 10%
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Class: Economy");
        System.out.println("Additional Facilities: Standard baggage limit (20kg).");
    }
}
