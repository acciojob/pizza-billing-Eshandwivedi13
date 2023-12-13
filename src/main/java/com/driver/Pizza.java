package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(this.isVeg){
            this.price = 300;
        }else{
            this.price = 400;
        }
        this.bill = "";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){//added 80 for adding cheese
        this.price += 80;
    }
    public void addExtraToppings(){
        if(this.isVeg){//added money (veg and non-veg respectively) for adding toppings
            this.price += 70;
        }else{
            this.price += 130;
        }
    }
    public void addTakeaway(){
        this.price += 20;
    }
    public String getBill(){
        this.bill += "Extra Cheese Added: 80 \n";
        this.bill += "Extra Toppings Added: 70 \n";
        this.bill += "Paperbag Added: 20 \n";
        this.bill += "Total Price: 470 \n";
        return this.bill;
    }
}
