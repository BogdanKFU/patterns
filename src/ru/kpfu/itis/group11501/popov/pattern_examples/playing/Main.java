package ru.kpfu.itis.group11501.popov.pattern_examples.playing;

import ru.kpfu.itis.group11501.popov.pattern_examples.playing.characters.Character;
import ru.kpfu.itis.group11501.popov.pattern_examples.playing.characters.CharacterFactory;
import ru.kpfu.itis.group11501.popov.pattern_examples.playing.characters.CharacterFactoryImpl;
import ru.kpfu.itis.group11501.popov.pattern_examples.playing.characters.CharacterImpl;
import ru.kpfu.itis.group11501.popov.pattern_examples.playing.classes.Mage;
import ru.kpfu.itis.group11501.popov.pattern_examples.playing.classes.Warrior;
import ru.kpfu.itis.group11501.popov.pattern_examples.playing.weapons.TrollAxe;

/**
 * Created by Bogdan Popov on 08.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        Character character1 = new CharacterImpl(new Mage());
        Character character2 = new CharacterImpl(new Warrior());
        character1.setWeapon(new TrollAxe());
        character1.attack();
        character2.attack();
        CharacterFactory factory = new CharacterFactoryImpl();
        Character character = factory.createCharacter(new Mage());
        character.attack();
        character.block();
    }
}
