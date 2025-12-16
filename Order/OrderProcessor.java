public class OrderProcessor {

    private Item[] items;
    private double taxRate;
    private int premiumCount = 0;
    private double subtotal = 0;

    public void claculateItemTotal(Item item) {
        double itemTotal = item.getPrice() * item.getQuantity();
        subtotal += itemTotal;

    }

    public void isExpensive(Item item) {
        String[] expensiveItems = new String[premiumCount];
        if (item.getPrice() > 50.0) {
            premiumCount += 1;
            expensiveItems[premiumCount - 1] = item.getName();
            System.out.println(item.getName() + " is a premium item at $" + item.getPrice());
        } else {
            System.out.println(item.getName() + " is a regular item at $" + item.getPrice());
        }
    }

    public double calculateTotal() {
        double tax;
        double total;
        if (subtotal > 0) {
            tax = subtotal * taxRate;
            total = subtotal + tax;
            return total;
        } else {
            tax = 0;
            total = 0;
            return total;

        }

    }

    public void output() {
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax: $" + subtotal * taxRate);
        System.out.println("Total: $" + calculateTotal());
        System.out.println("Number of premium items: " + premiumCount);
    }

}
