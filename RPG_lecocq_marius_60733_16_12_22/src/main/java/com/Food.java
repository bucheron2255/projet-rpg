package com;

public class Food extends Consumable {
   
    public Food(String name, int dmg, int hp,  int exp){
        super(name, dmg, hp,exp);
    }

    Food viande = new Food("Viande", 0, 2, 4); 
    Food fruit = new Food("Fruit", 0, 1, 2);
    Food bière = new Food("Bière", 0, 4, 8);

    public void ConsumFood(String name, Hero consumer){

    }
}