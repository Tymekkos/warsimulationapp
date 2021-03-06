package com.company.model;

import java.util.Random;

public class Hunter implements ICharacter {

        private int attack;
        private int hp;
        private int armor;

    public Hunter(int attack, int hp, int armor) {
        this.attack = attack;
        this.hp = hp;
        this.armor = armor;
    }

    @Override
    public String toString(){
        return "H";
    }

    @Override
    public int attack(int opponentArmor) {
        // hp = 500 attack = 20-50 armor = 20 25%chance for double attack
        Random random = new Random();
        int value = random.nextInt(99)+1;
        int armorValue = random.nextInt(99)+1;
        int critChance = random.nextInt(99)+1;
        int tmpAttack = (value*attack)/100 - (opponentArmor*armorValue)/100;
        if(critChance >= 25)
        {
            tmpAttack = tmpAttack*2;
        }
        if(tmpAttack <= 0){
            tmpAttack = 0;
        }
        System.out.println("Hunter attacked!");
        return tmpAttack;
    }

    @Override
    public int getHP() {
        return this.hp;
    }

    @Override
    public void setHP(int hp) {
        this.hp = hp;
    }

    @Override
    public int getArmor() {
        return this.armor;
    }

}

