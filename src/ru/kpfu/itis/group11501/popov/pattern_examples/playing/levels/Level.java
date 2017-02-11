package ru.kpfu.itis.group11501.popov.pattern_examples.playing.levels;

/**
 * Created by Bogdan Popov on 08.02.2017.
 */
public class Level {
    private int hp;
    private int damage;
    private int num;
    // Максимальный опыт на данном уровне
    private int exp;

    public Level(int num, int hp, int damage, int exp) {
        this.hp = hp;
        this.damage = damage;
        this.num = num;
        this.exp = exp;
    }

    public int getHp() {
        return hp;
    }

    public int getDamage() {
        return damage;
    }

    public int getNum() {
        return num;
    }

    public int getExp() {
        return exp;
    }
}
