package com.company.look;

/**
 * Created by Root on 01.02.2016.
 */
public class SaleableHouse implements Sellable {
    House house;


    public SaleableHouse() {
    }

    public SaleableHouse(House house) {
        this.house = house;

    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    @Override
    public int price() {
        return house.price();
    }

    @Override
    public String name() {
        return house.description();
    }

    @Override
    public String description() {
        return house.name();
    }
}
