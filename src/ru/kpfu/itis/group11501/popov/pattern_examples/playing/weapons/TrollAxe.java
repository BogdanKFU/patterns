package ru.kpfu.itis.group11501.popov.pattern_examples.playing.weapons;

/**
 * Created by Bogdan Popov on 08.02.2017.
 */
public class TrollAxe extends Weapon {
    public TrollAxe() {
        super("Troll Axe", 80, 10);
    }

    @Override
    public void use() {
        System.out.println("Slice! I use Troll Axe");
    }
}
