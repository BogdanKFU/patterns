package ru.kpfu.itis.group11501.popov.pattern_examples.playing.levels;

import java.util.Queue;

/**
 * Created by Bogdan Popov on 09.02.2017.
 */
public abstract class LevelFactory {
    protected static final int LEVEL_CAPACITY = 10;
    public abstract Queue<Level> createLevelQueue();
}
