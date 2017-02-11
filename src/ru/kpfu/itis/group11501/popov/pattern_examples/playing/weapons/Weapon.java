package ru.kpfu.itis.group11501.popov.pattern_examples.playing.weapons;

/**
 * Created by Bogdan Popov on 08.02.2017.
 */
public abstract class Weapon {
    private String name;
    private int damage;
    private int rangeAttack;

    public Weapon(String name, int damage, int rangeAttack) {
        this.name = name;
        this.damage = damage;
        this.rangeAttack = rangeAttack;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getRangeAttack() {
        return rangeAttack;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setRangeAttack(int rangeAttack) {
        this.rangeAttack = rangeAttack;
    }

    public abstract void use();
}
