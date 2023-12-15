package com.driver;
/*
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
}*/
public class Pizza {
    private int price;
    private Boolean isVeg;
    private String bill;
    private final int  cheese=80;
    private final int vegTopping=70;
    private final int nonVegTopping=120;
    private final int bag=20;
    private boolean cheeseF=false;
    private boolean toppingF=false;
    private boolean bagF=false;
    private boolean billF=false;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg)
        {
            price=300;
        }
        else
        {
            price=400;
        }

        this.bill="Base Price Of The Pizza: "+price+"\n";
        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(cheeseF==false)
        {
            cheeseF=true;
            price+=80;
            bill+="Extra Cheese Added: "+cheese+"\n";
        }
    }

    public void addExtraToppings() {
        // your code goes here
        if(toppingF==false)
        {
            toppingF=true;
            int tempTop= isVeg ? vegTopping : nonVegTopping;
            price+=tempTop;
            bill+="Extra Toppings Added: "+tempTop+"\n";
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(bagF==false)
        {
            bagF=true;
            price+=bag;
            bill+="Paperbag Added: "+bag+"\n";
        }
    }

    public String getBill(){
        if(billF==false)
        {
            bill+="Total Price: "+price+"\n";
            billF=true;
        }
        return bill;
    }
}