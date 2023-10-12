package program7.entities;

public class Item {
    private String name;
    private Double unityPrice;
    private Integer quantity;

    public Item(String name, Double unityPrice, Integer quantity) {
        this.name = name;
        this.unityPrice = unityPrice;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getUnityPrice() {
        return unityPrice;
    }

    public void setUnityPrice(Double unityPrice) {
        this.unityPrice = unityPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double subTotal() {
        return unityPrice * quantity;
    }
}
