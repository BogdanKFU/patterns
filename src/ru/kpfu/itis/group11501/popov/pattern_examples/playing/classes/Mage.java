package ru.kpfu.itis.group11501.popov.pattern_examples.playing.classes;

import ru.kpfu.itis.group11501.popov.pattern_examples.playing.levels.LevelFactory;
import ru.kpfu.itis.group11501.popov.pattern_examples.playing.levels.MageLevelFactory;

/**
 * Created by Bogdan Popov on 08.02.2017.
 */
public class Mage extends CharacterClass {
    public Mage() {
        super(new MageLevelFactory());
    }

    /*
    Уровень будет создаваться в Фабрике уровней
     */

    @Override
    public void block() {
        System.out.println("Magic barrier protect myself!");
    }

    @Override
    public void skip() {
        System.out.println("Mage skips funny!");
    }
}
