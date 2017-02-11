package ru.kpfu.itis.group11501.popov.pattern_examples.playing.characters;

import ru.kpfu.itis.group11501.popov.pattern_examples.playing.weapons.Weapon;

/**
 * Created by Bogdan Popov on 08.02.2017.
 */
public interface Character {
    void attack();
    void block();
    void skip();
    /*
    Должно выбрасывать исключение. Некоторым персонажам невозможно назначить оружие.
    А лучше создать класс WeaponBehavior (Паттерн Стратегия).
     */
    void setWeapon(Weapon weapon);
}
