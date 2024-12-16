public class TicketReservationSystem {
    public static void main(String[] args) {
        // Contoh penggunaan
        Ticket economy = new EconomyTicket("John Doe", 1000);
        Ticket business = new BusinessTicket("Jane Smith", 1000);
        Ticket firstClass = new FirstClassTicket("Alice Brown", 1000);

        System.out.println("Economy Ticket Details:");
        economy.displayDetails();
        System.out.println();

        System.out.println("Business Ticket Details:");
        business.displayDetails();
        System.out.println();

        System.out.println("First Class Ticket Details:");
        firstClass.displayDetails();
    }
}
