package com.realtime.RealtimeProjectOnlineFoodOrderingSystem;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class OnlineFood {

    @Id
    private int id;

    private String customerName;
    private String foodItem;
    private int quantity;
    private double totalAmount;
    private String orderDate;
    private String orderStatus;

   
    public OnlineFood() {
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getFoodItem() {
        return foodItem;
    }

    public void setFoodItem(String foodItem) {
        this.foodItem = foodItem;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return "OnlineFood [id=" + id +
                ", customerName=" + customerName +
                ", foodItem=" + foodItem +
                ", quantity=" + quantity +
                ", totalAmount=" + totalAmount +
                ", orderDate=" + orderDate +
                ", orderStatus=" + orderStatus + "]";
    }
}