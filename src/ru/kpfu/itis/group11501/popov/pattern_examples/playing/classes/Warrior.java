package ru.kpfu.itis.group11501.popov.pattern_examples.playing.classes;

import ru.kpfu.itis.group11501.popov.pattern_examples.playing.levels.LevelFactory;
import ru.kpfu.itis.group11501.popov.pattern_examples.playing.levels.WarriorLevelFactory;

/**
 * Created by Bogdan Popov on 08.02.2017.
 */
public class Warrior extends CharacterClass {

    public Warrior() {
        super(new WarriorLevelFactory());
    }

    @Override
    public void block() {
        System.out.println("I am too strong! I can protect myself!");
    }

    @Override
    public void skip() {
        System.out.println("Skipping with attack!");
    }
}
