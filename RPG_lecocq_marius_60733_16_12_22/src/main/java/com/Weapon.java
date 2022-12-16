package com;

public class Weapon extends Item {
    
    public Weapon(String name, int dmg, int hp,  int exp){
        super(name, dmg, hp, exp); 
    }

    Weapon sword = new Weapon("Claymore", 12, 0, 0);
    Weapon arrow = new Weapon("Flèche", 1, 0, 0); 
    Weapon book  = new Weapon("grimoire",7,3,10);
    Weapon axe   = new Weapon("hache",7,5,0);
    Weapon fire  = new Weapon("sort de feu",16,0,0 );
    Weapon legend = new Weapon("legendaire",25,10,15);
}