package ru.kpfu.itis.group11501.popov.pattern_examples.playing.characters;

import ru.kpfu.itis.group11501.popov.pattern_examples.playing.classes.CharacterClass;

/**
 * Created by Bogdan Popov on 10.02.2017.
 */
public class CharacterFactoryImpl implements CharacterFactory {

    @Override
    public Character createCharacter(CharacterClass characterClassClass) {
        return new CharacterImpl(characterClassClass);
    }
}
