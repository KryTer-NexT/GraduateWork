package kryternext.graduatework.app.models;

public class Order {
    private long orderTimestamp;
    private long confirmTimestamp;
    private String orderDate;
    private String confirmedDate;
    private User user;
    private double cost;
    private boolean isConfirmed;

    public Order() {
    }

    public long getOrderTimestamp() {
        return orderTimestamp;
    }

    public void setOrderTimestamp(long orderTimestamp) {
        this.orderTimestamp = orderTimestamp;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public boolean isConfirmed() {
        return isConfirmed;
    }

    public void setConfirmed(boolean isConfirmed) {
        this.isConfirmed = isConfirmed;
    }
}
