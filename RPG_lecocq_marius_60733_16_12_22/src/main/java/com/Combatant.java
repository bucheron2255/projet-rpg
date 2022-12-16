package com;

abstract class Combatant {

    protected int armor ; 
    protected int hp ; 
    protected int defse ; 
    protected int atck ; 
    protected int exp ;

    public Combatant(int armor, int hp, int defse, int atck, int exp){
        this.armor = armor ;
        this.hp = hp ; 
        this.exp = exp;
        this.defse = defse ; 
        this.atck = atck ; 
       
    }

    public int getArmor(){
        return this.armor ; 
    }
    
    public int getHp(){
        return this.hp ; 
    }

    public int dfse(){
        return this.defse ; 
    }

    public int atck(){
        return this.atck ;
    }

    public int exp(){
        return this.exp; 
    }

}