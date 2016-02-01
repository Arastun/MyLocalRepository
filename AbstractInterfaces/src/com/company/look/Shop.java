package com.company.look;

/**
 * Created by Администратор on 27.01.2016.
 */
public class Shop {
    public static void main(String[] args) {
        /*Sellable [] goods = {new SellablePet("cat" , "Tom" , 100),
                             new House(100, "Klovskiy Uzviz" , 1000) ,
                            new Car("Toyota" , 2010 , 10000)};
        for (Sellable g : goods){
            System.out.println(g.name()+"|"+g.price()+"|"+g.description());
        }*/


     //   House house = new House(100, "Klovskiy Uzviz", 1000);
     //   SaleableHouse saleableHouse = new SaleableHouse(house, SaleableHouse.Color.Brick);

        //System.out.println(saleableHouse);

        Sellable[] goods = {new SellablePet("cat", "Tom", 100),
                new SaleableHouse(new House(100, "Klovskiy Uzviz", 1000) ),
                new Car("Toyota", 2010, 10000)};
        for (Sellable g : goods) {

            System.out.println(g.name() + "|" + g.price() + "|" + g.description());

        }
    }
}