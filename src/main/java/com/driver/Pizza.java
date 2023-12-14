package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.bill = "";
        if(this.isVeg){
            this.price = 300;
            this.bill += "Base Price Of The Pizza: 300 \n";
        }else{
            this.price = 400;
            this.bill += "Base Price Of The Pizza: 400 \n";
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){//added 80 for adding cheese, and updated bill
        this.price += 80;
        this.bill += "Extra Cheese Added: 80 \n";
    }
    public void addExtraToppings(){
        if(this.isVeg){//added money (veg and non-veg respectively) for adding toppings and updated bill
            this.price += 70;
            this.bill += "Extra Toppings Added: 70 \n";
        }else{
            this.price += 130;
            this.bill += "Extra Toppings Added: 130 \n";
        }
    }
    public void addTakeaway(){//added bag and its price
        this.price += 20;
        this.bill += "Paperbag Added: 20 \n";
    }
    public String getBill(){
        this.bill += "Total Price: " + String.valueOf(this.price) +"\n";
        return this.bill;
    }
}
