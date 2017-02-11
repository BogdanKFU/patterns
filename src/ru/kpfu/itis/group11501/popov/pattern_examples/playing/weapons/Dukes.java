package ru.kpfu.itis.group11501.popov.pattern_examples.playing.weapons;

import ru.kpfu.itis.group11501.popov.pattern_examples.playing.weapons.Weapon;

/**
 * Created by Bogdan Popov on 08.02.2017.
 */
public class Dukes extends Weapon {
    public Dukes() {
        super("Dukes", 50, 8);
    }

    @Override
    public void use() {
        System.out.println("I fight with my dukes!");
    }
}
