package com;

public class Mage extends SpellCaster {
    
    private Weapon weapon ;
    private int armor ; 
    private Potion potion ; 
    private Food food ; 

    public Mage(int hp, int armor, int dfse, int atck, int exp){
        super(armor, hp, dfse, atck, exp); 
    }
    

    public void Magie(Enemy atcké){
        atcké.PerdreHp(5);
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
}