package models;

public class User {
    private String username;
    private String password;
    private String type;
    private int totalQuantity;
    private long createdAt;
    private long lastUpdated;

    public User(String username, String password, String type, int totalQuantity, long createdAt, long lastUpdated) {
        this.username = username;
        this.password = password;
        this.type = type;
        this.totalQuantity = totalQuantity;
        this.createdAt = createdAt;
        this.lastUpdated = lastUpdated;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(int totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public long getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(long lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
