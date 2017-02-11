package ru.kpfu.itis.group11501.popov.pattern_examples.playing.classes;

import ru.kpfu.itis.group11501.popov.pattern_examples.playing.levels.Level;
import ru.kpfu.itis.group11501.popov.pattern_examples.playing.levels.LevelFactory;
import ru.kpfu.itis.group11501.popov.pattern_examples.playing.weapons.Weapon;

import java.util.Queue;

/**
 * Created by Bogdan Popov on 08.02.2017.
 */
public abstract class CharacterClass {
    private LevelFactory levelFactory;
    private Queue<Level> levelQueue;
    // Скорость передвижения
    private int speed;

    public CharacterClass(LevelFactory levelFactory) {
        this.levelFactory = levelFactory;
        levelQueue = levelFactory.createLevelQueue();
    }

    public abstract void block();

    public abstract void skip();

    public void attack(Weapon weapon) {
        weapon.use();
    }

    public Level getLevelByExp(int exp) {
        Level level = null;
        for (Level l: levelQueue) {
            if(l.getExp() < exp) {
                level = l;
            }
            else return level;
        }
        return level;
    }
}
