package com;

public class Dwarf extends Hero {
    
    private Weapon weapon ;
    private Potion potion ; 
    private Food food ; 

    public Dwarf(int armor,int hp ,int dfse,int atck, int exp, Weapon weapon, Food food, Potion potion){
        super(armor, hp, dfse, atck, exp) ; 
        this.weapon = weapon ; 
        this.food = food ; 
        this.potion = potion ; 
    }

    public void Attack(Enemy atcké, Weapon epee){
        atcké.PerdreHp(epee.dg);
    }

    public void Consommer(Food consommable){
        
    }

    public Weapon getWeapon(){
        return this.weapon ;
    }
    public Potion getPotion(){
        return this.potion ; 
    }

    public Food getFood(){
        return this.food ; 
    }
}