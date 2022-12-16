package com;

public class angel extends SpellCaster {

    private Weapon weapon ;
    private int armor ; 
    private Potion potion ; 
    private Food food ; 
    private int exp;

    public angel(int hp, int armor, int dfse, int atck, int exp){
        super(armor, hp, dfse, atck, exp); 
    }

    public Weapon getWeapon(){
        return this.weapon ;
    }

    public int getArmor(){
        return this.armor ;
    }

    public Potion getPotion(){
        return this.potion ; 
    }

    public Food getFood(){
        return this.food ;
    }

    public int getXp(){
        return this.exp; 
    }
    
}