package com;

abstract class SpellCaster extends Hero {

    public SpellCaster(int hp, int armor, int defse, int atck, int exp){
        super(armor, hp, defse, atck, exp); 
    }

    public String toString(){
        return "Health : " + String.valueOf(hp) + "Protection : " + String.valueOf(armor) + "Defence : " + String.valueOf(defse) + "Attack : " + String.valueOf(atck) ;
        
    }

    public void PerdreHp(int m){
        this.hp -= m; 
    }

    public void PrendreHp(int h){
        this.hp += h;
    }

    public void PerdreXp(int j){
        this.exp -= j ; 
    }

    public void PrendreXp(int k){
        this.exp += k ; 
    }
    
}
