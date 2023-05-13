package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    final int bp;
    int cheese = -1;
    int paper;
    int top = -1;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        price = (isVeg)?300:400;
        bp = price;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(cheese==-1){
            cheese = 80;
            price += cheese;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(top==-1){
            top = (isVeg)? 70:120;
            price +=top;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(paper==0){
            paper=20;
            price += paper;
        }
    }

    public String getBill(){
        // your code goes here
        String ans = "Base Price Of The Pizza: " + bp + "\n";
        if(cheese>0)ans += "Extra Cheese Added: " + cheese + "\n";
        if(top>0)ans += "Extra Toppings Added: " + top + "\n";
        if(paper>0)ans += "Paperbag Added: " + paper + "\n";
        ans += "Total Price: " + price +"\n";
        bill = ans;
        return this.bill;
    }
}