package models;

public class Donation {

    private String name;
    private int quantity;
    private long expirationDate;
    private String city;

    public Donation(String name, int quantity, long expirationDate, String city) {
        this.name = name;
        this.quantity = quantity;
        this.expirationDate = expirationDate;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public long getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(long expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
