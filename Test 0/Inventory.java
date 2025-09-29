public class Inventory {
    private String itemName;
    private int quantity;
    private double price;

    public Inventory(String itemName, int quantity,double price) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String toString() {
        return "Item: " + itemName + ", Quantity: " + quantity + ", Price: $" + price;
    }

    public boolean equals(Inventory otherInventory) {
        if (
            this.itemName.equals(otherInventory.itemName)
                && this.quantity == otherInventory.quantity
                && this.price == otherInventory.price
        ) {
            return true;
        } else {
            return false;
        }
    }
    
    public void raisePrice(double percentIncrease) {
        this.price = (((percentIncrease / 100) + 1) * price);
    }
    
    
    
}
