public class BillingItem {
    private String name;
    private double pricePerUnit;
    private int quantity;

    public BillingItem(String name, double pricePerUnit, int quantity) {
        this.name = name;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return pricePerUnit * quantity;
    }

    @Override
    public String toString() {
        return name + " - $" + pricePerUnit + " x " + quantity + " = $" + getTotalPrice();
    }
}
