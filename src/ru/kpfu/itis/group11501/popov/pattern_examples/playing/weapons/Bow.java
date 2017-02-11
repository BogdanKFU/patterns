package ru.kpfu.itis.group11501.popov.pattern_examples.playing.weapons;

/**
 * Created by Bogdan Popov on 08.02.2017.
 */
public class Bow extends Weapon {

    public Bow() {
        super("The Bow", 100, 100);
    }

    @Override
    public void use() {
        System.out.println("I use the bow!");
    }
}
