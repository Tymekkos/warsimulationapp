package com.company.model;

import java.util.Random;

public class Mage implements ICharacter {

    private final int attack;
    private int hp;
    private int armor;


    public Mage(int attack, int hp, int armor) {
        this.attack = attack;
        this.hp = hp;
        this.armor = armor;
    }

    @Override
    public String toString(){
        return "M";
    }

    @Override
    public int attack(int opponentArmor) {
        // hp = 300 attack = 80-100 armor = 20
        Random random = new Random();
        int value = random.nextInt(99)+1;
        int armorValue = random.nextInt(99)+1;
        int tmpAttack = (value*attack)/100 - (opponentArmor*armorValue)/100;
        if(tmpAttack <= 0){
            tmpAttack = 0;
        }
        System.out.println("Wizard attacked!");
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