package ru.kpfu.itis.group11501.popov.pattern_examples.playing.levels;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created by Bogdan Popov on 09.02.2017.
 */
public class MageLevelFactory extends LevelFactory {

    @Override
    public Queue<Level> createLevelQueue() {
        Queue<Level> queue = new ArrayBlockingQueue<Level>(LEVEL_CAPACITY);
        queue.add(new Level(1, 500, 20, 100));
        queue.add(new Level(2, 600, 25, 500));
        queue.add(new Level(3, 700, 30, 1500));
        return queue;
    }
}
