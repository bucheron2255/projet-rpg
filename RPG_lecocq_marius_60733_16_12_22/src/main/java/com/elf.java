package com;

public class elf extends Hero {
    
    private Weapon weapon ;
    private Potion potion ; 
    private Food food ; 

    public elf(int hp, int armor, int dfse, int atck, int exp, Weapon weapon, Potion potion, Food food){
        super(hp, armor, dfse, atck, exp) ;
        this.weapon = weapon ;
        this.potion = potion ;
        this.food = food ;
    }

    public void Tirer(int arrow, Enemy atcké){
        while(arrow != 0){
            atcké.PerdreHp(1); 
        }
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