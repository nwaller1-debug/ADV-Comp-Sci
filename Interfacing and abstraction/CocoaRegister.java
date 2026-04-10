import java.util.ArrayList;

public class CocoaRegister {

    public static final double TAX_RATE = 0.0875;

    private ArrayList<Sellable> items;
    private ArrayList<Integer> quantities;

    public CocoaRegister() {
        items = new ArrayList<>();
        quantities = new ArrayList<>();
    }

    public void addItem(Sellable item, int quantity) {
        // TODO:
        // - if item is null OR quantity <= 0, do nothing
        // - otherwise, add item and quantity to the parallel ArrayLists
        if (item == null || quantity <= 0) {
            return;
        }
        items.add(item);
        quantities.add(quantity);
    }

    public double getSubtotal() {
        // TODO:
        // sum item.getBasePrice() * quantity for all line items
        // return rounded to 2 decimals using ChocolateBar.round2(...)
        double total = 0.0;
        for (int i = 0; i < items.size(); i++) {
            total += (items.get(i).getBasePrice() * quantities.get(i));
        }
        return ChocolateBar.round2(total);
    }

    public double getTax() {
        // TODO:
        // tax = subtotal * TAX_RATE, rounded to 2 decimals
        return ChocolateBar.round2(getSubtotal() * TAX_RATE);
    }

    public double getTotal() {

        return ChocolateBar.round2(getSubtotal() + getTax());
    }

    public void printReceipt() {
        // TODO: Print EXACTLY the required receipt format.
        //
        // Hints:
        // - Header line: "== COCOA CORNER =="
        // - For each line item i:
        // (i+1) + ". " + name + " x" + qty + " @ $" + unit + " = $" + lineTotal
        // - Use ChocolateBar.money(...) for all currency formatting
        String y = "== COCOA CORNER ==\n";
        for (int i = 0; i < items.size(); i++) {
            y += (i + 1) + ". " + items.get(i).getName()
                    + " x" + quantities.get(i) + " @ $"
                    + ChocolateBar.money(items.get(i).getBasePrice()) + " = $"
                    + ChocolateBar.money(items.get(i).getBasePrice() * quantities.get(i)) + "\n";
        }
        y += "Subtotal: $" + ChocolateBar.money(getSubtotal())
                + "\nTax: $" + ChocolateBar.money(getTax())
                + "\nTotal: $" + ChocolateBar.money(getTotal());
        System.out.println(y);
    }

}
