package ru.kpfu.itis.group11501.popov.pattern_examples.playing.weapons;

/**
 * Created by Bogdan Popov on 08.02.2017.
 */
public class Axe extends Weapon {

    public Axe() {
        super("The Axe",70, 10);
    }

    @Override
    public void use() {
        System.out.println("Slice! I use the Axe");
    }
}
