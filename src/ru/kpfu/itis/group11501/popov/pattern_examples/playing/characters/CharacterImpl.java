package ru.kpfu.itis.group11501.popov.pattern_examples.playing.characters;

import ru.kpfu.itis.group11501.popov.pattern_examples.playing.Game;
import ru.kpfu.itis.group11501.popov.pattern_examples.playing.classes.CharacterClass;
import ru.kpfu.itis.group11501.popov.pattern_examples.playing.levels.Level;
import ru.kpfu.itis.group11501.popov.pattern_examples.playing.weapons.Dukes;
import ru.kpfu.itis.group11501.popov.pattern_examples.playing.weapons.Weapon;

/**
 * Created by Bogdan Popov on 08.02.2017.
 */
public class CharacterImpl implements Character {
    /*
    Паттерн Стратегия - определяет поведение персонажа в зависимости от принадлежности к классу.
     */
    private CharacterClass characterClass;
    private Weapon weapon;
    private int exp;
    private Level level;
    // Координаты центра модели. Карта 2D.
    private int x;
    private int y;
    // Размеры модели. Для упрощения примера все модели прямоугольные. a, b - расстояния до центра модели.
    private int a;
    private int b;
    /*
    Наблюдатель - игра.
    При каждом вызове методов attack(), block() и skip(), а также при изменении координат - отправляются данные на сервер.
    По сути игра - это сервер, на котором и будет определяться действия персонажа. Попал ли игрок, сумел ли заблокировать урон?
    Следует инкапсулировать данные в отдельный класс CharacterData.
    Нужно учесть, что у разных персонажей могут быть различные типы данных.
    Например NPC могут реализовывать не CharacterClass, а BeastsClass. Или у них может не быть оружия Weapon.
     */
    /*
    Предполагается создание дерева навыков для каждого персонажа.
    Дереья навыков разичаются у представителей различных классов.
     */
    private Game game;
    /*
    Тут все шмотки
    Еще тут должен быть левел, который определяет дамаг и другие характеристики
    Левел по сути - Состояние
     */

    public CharacterImpl(CharacterClass characterClass) {
        this.characterClass = characterClass;
        this.weapon = new Dukes();
        this.exp = 0;
        this.level = characterClass.getLevelByExp(exp);
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public void attack() {
        /*
        Атака может быть разных видов в зависимости от нажатых клавиш
        Нажатая клавиша - Команда
         */
        characterClass.attack(weapon);
    }

    @Override
    public void block() {
        characterClass.block();
    }

    @Override
    public void skip() {
        characterClass.skip();
    }

    public void levelUp() {
        if (exp >= level.getExp()) {
            level = characterClass.getLevelByExp(exp);
        }
    }

    public void changeCharacterClass(CharacterClass characterClass) {
        this.characterClass = characterClass;
        level = characterClass.getLevelByExp(exp);
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public CharacterClass getCharacterClass() {
        return characterClass;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public int getExp() {
        return exp;
    }

    public Level getLevel() {
        return level;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
