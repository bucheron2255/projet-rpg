package com;

class Enemy extends Combatant{

    public Enemy(int hp, int armor, int defse, int atck, int exp){
         super(hp, armor, defse, atck, exp) ;
    }

    public String toString(){
        return "Attack : " + String.valueOf(this.atck) + "Defence : " + String.valueOf(this.defse) + "Armor : " + String.valueOf(this.armor) + "Health : " + String.valueOf(this.hp);  
    }

    public void PerdreHp(int n){
       this.hp -= n ; 
    }
}