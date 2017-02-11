package ru.kpfu.itis.group11501.popov.pattern_examples.playing.characters;

import ru.kpfu.itis.group11501.popov.pattern_examples.playing.classes.CharacterClass;

/**
 * Created by Bogdan Popov on 09.02.2017.
 */
public interface CharacterFactory {
    Character createCharacter(CharacterClass characterClassClass);
}
