package com;

import java.util.Collections;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class Game{
    static ArrayList<Hero> team ; 
    static ArrayList<Enemy> enemies ; 
    static ArrayList<Integer> choix = new ArrayList<Integer>();

    public static void main(String[] args){
        int combats = 5 ; 
        team = setHeros(); 
        enemies = setEnemies();
    }

    public static ArrayList<Hero> setHeros(){
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Veuillez entrer le nombre de combatants dans cette équipe");
        int n = scanner.nextInt(); 
        choix.add(n);
        ArrayList<Hero> team = new ArrayList<Hero>(); 
        for(int i = 0; i < n; i++){
            System.out.println("\nQuel Hero voulez-vous ?\n"); 
            System.out.println(" _________________________________________________________________________ "); 
            System.out.println("|         1        |          2       |        3         |        4       |");
            System.out.println(" __________________ __________________ __________________ ________________|"); 
            System.out.println("|       nain       |       elfe       |       ange       |     sorcier    |"); 
            System.out.println("|                  |                  |                  |                |"); 
            System.out.println("| atck : n         | atck : i         | atck : j         | atck : k       |");
            System.out.println("| defse : a        | defse : b        | defse : c        | defse : d      |"); 
            System.out.println("| health : e       | health : f       | health : g       | health : h     |"); 
            System.out.println("| armor : l        | armor: m         | armor : o        | armor : p      |"); 
            System.out.println("|__________________ __________________ __________________ ________________|"); 
            System.out.println("\nChoisissez le numéro correspondant ; \n"); 
            int h = scanner.nextInt();
            switch(h){
                case 1 : 
                    team.add(new Dwarf(h, h, n, i, h, null, null, null));
                    break ; 
                case 2 :
                    team.add(new elf(h, h, n, i, h, null, null, null)); 
                    break;
                case 3 : 
                    team.add(new angel(h, h, n, i, h));    
                    break;
                case 4 : 
                    team.add(new Mage(h, h, n, i, h));
                    break; 
                    }
            }
        return team; 
    }

    public static ArrayList<Enemy> setEnemies(){
        ArrayList<Enemy> enemies = new ArrayList<Enemy>(); 

        Random random = new Random();
        int j = (int) choix.get(0);
        for(int i = 1; i <=j; i++) {
            int value = random.nextInt((4 - 1) + 1) + 1;
            switch(j){
                case 1 : 
                    enemies.add(new Enemy(value, value, j, i, value));
                    break ; 
            }
        }
        return enemies ;
    }

}