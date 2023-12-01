package com.example.eat_us_app;

public class Item {
    private String name;
    private int quantity;
    private String vdate;
    private String memo;

    public Item(String name, int quantity, String vdate, String memo) {
        this.name = name;
        this.quantity = quantity;
        this.vdate = vdate;
        this.memo = memo;
    }

    public String getName() { return name; }
    public int getQuantity() { return quantity; }
    public String getVdate() { return vdate; }
    public String getMemo() { return memo; }
}
