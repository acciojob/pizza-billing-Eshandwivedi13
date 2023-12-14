package com.driver;

public class DeluxePizza extends Pizza {
    public DeluxePizza(Boolean isVeg) {//constructor calling parent
        super(isVeg);
        super.addExtraCheese();
        super.addExtraToppings();
    }
}
