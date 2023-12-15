package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private boolean isCheesy;
    private boolean isToppy;
    private boolean isBaggy;
    private boolean billy;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.bill = "";
        if(this.isVeg){
            this.price = 300;
            this.bill += "Base Price Of The Pizza: 300\n";
        }else{
            this.price = 400;
            this.bill += "Base Price Of The Pizza: 400\n";
        }
        isCheesy = false;
        isToppy = false;
        isBaggy = false;
        billy = false;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){//added 80 for adding cheese, and updated bill
        if(!isCheesy){
            this.price += 80;
            this.bill += "Extra Cheese Added: 80 \n";
            isCheesy = true;
        }
    }
    public void addExtraToppings(){
        if(!isToppy){
            if(this.isVeg){//added money (veg and non-veg respectively) for adding toppings and updated bill
                this.price += 70;
                this.bill += "Extra Toppings Added: 70 \n";
            }else{
                this.price += 120;
                this.bill += "Extra Toppings Added: 120 \n";
            }
            isToppy = true;
        }
    }
    public void addTakeaway(){//added bag and its price
        if (!isBaggy) {
            this.price += 20;
            this.bill += "Paperbag Added: 20 \n";
            isBaggy = true;
        }
    }
    public String getBill(){
       if(!billy){
           this.bill += "Total Price: " + String.valueOf(this.price) +"\n";//even only price works here, cuz String + int = string
           billy = true;
       }
        return this.bill;
    }
}
