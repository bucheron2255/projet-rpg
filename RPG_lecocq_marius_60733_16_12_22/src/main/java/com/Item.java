package com;

abstract class Item {
    
    protected int dg ;
    protected String name ;
    protected int exp ;  
    protected int hp ; 

    public Item(String name, int dmg, int hp,  int exp){
        this.name = name ;
        this.dg = dmg ;
        this.hp = hp ;
        this.exp = exp ;
    }

    public int getDmg(){
        return this.dg ; 
    }

    public String getName(){
        return this.name ; 
    }

    public int getXp(){
        return this.exp ; 
    }
     
    public int getHp(){
        return this.hp ;
    }
}
