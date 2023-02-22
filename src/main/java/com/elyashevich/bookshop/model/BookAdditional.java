package com.elyashevich.bookshop.model;

import java.util.Objects;

public class BookAdditional {
    private int count;
    private float price;


    public BookAdditional(int count, float price) {
        this.count = count;
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookAdditional that = (BookAdditional) o;
        return count == that.count && Float.compare(that.price, price) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, price);
    }
}
