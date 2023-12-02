package com.example.eat_us_app;

import android.os.Parcel;
import android.os.Parcelable;

public class FridgeItem implements Parcelable{
    private int categoryimage;
    private String name;
    private int quantity;
    private String vdate;
    private String memo;

    public FridgeItem(int categoryimage, String name, int quantity, String vdate, String memo) {
        this.categoryimage = categoryimage;
        this.name = name;
        this.quantity = quantity;
        this.vdate = vdate;
        this.memo = memo;
    }

    public FridgeItem(Parcel in) {
        categoryimage = in.readInt();
        name = in.readString();
        quantity = in.readInt();
        vdate = in.readString();
        memo = in.readString();
    }
    public static final Creator<FridgeItem> CREATOR = new Creator<FridgeItem>() {
        @Override
        public FridgeItem createFromParcel(Parcel in) {
            return new FridgeItem(in);
        }

        @Override
        public FridgeItem[] newArray(int size) {
            return new FridgeItem[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeInt(categoryimage);
        parcel.writeString(name);
        parcel.writeInt(quantity);
        parcel.writeString(vdate);
        parcel.writeString(memo);
    }

    public int getCategoryimage() { return categoryimage; }
    public String getName() { return name; }
    public int getQuantity() { return quantity; }
    public String getVdate() { return vdate; }
    public String getMemo() { return memo; }
}
