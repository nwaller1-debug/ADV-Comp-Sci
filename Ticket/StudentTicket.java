import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

public class StudentTicket extends StandardTicket {

    private static final double STUDENT_DISCOUNT = 0.50;

    public StudentTicket(Date eventDate, int ticketCount) {
        super(eventDate, ticketCount);
    }

    public double getTotalPrice() {
        return (ticketCount * (super.getBasePrice() * (super.getTax() + 1))) * STUDENT_DISCOUNT;
    }

    @Override
    public void printTicketType() {
        System.out.println("Ticket Type: Student (Must Show ID)");
    }

    @Override
    public void printPrice() {
        BigDecimal decimalFormatter = new BigDecimal(getTotalPrice()).setScale(2, RoundingMode.HALF_UP); // rounds
                                                                                                         // totalPrice
                                                                                                         // to 2 decimal
                                                                                                         // places, will
                                                                                                         // be 1 decimal
                                                                                                         // place if
                                                                                                         // last digit
                                                                                                         // is 0 (i.e.
                                                                                                         // 7.50 -> 7.5)

        System.out.println("Ticket Price: $" + decimalFormatter.doubleValue()); // prints the price
    }

    @Override
    public void printCancellationPolicy() {
        super.printCancellationPolicy();
    }

    @Override
    public void printTicketDetails() {
        super.printTicketDetails();
        printTicketType();
        printPrice();
        printCancellationPolicy();

    }
}
