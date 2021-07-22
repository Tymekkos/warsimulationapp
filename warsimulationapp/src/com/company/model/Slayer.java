package com.company.model;
//ignores armor, deals damage based on max health
public class Slayer implements ICharacter {

    private final int attack;
    private int hp;
    private int armor;

    public Slayer(int attack, int hp, int armor) {
        this.attack = attack;
        this.hp = hp;
        this.armor = armor;
    }

    @Override
    public String toString(){
        return "S";
    }

    @Override
    public int attack(int opponentArmor) {
        // hp = 400 attack = 20-30 armor = 15 jesli max zdrowie przeciwnika jest 2 razy wieksze od slayera atakuje on wtedy 2 razy mocniej
        return 50;
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
