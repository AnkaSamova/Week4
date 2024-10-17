package ru.itgirlschool.week4._main;

import ru.itgirlschool.week4.entity.Boat;
import ru.itgirlschool.week4.entity.Fish;
import ru.itgirlschool.week4.util.SwimExecutor;

public class _Main {
    public static void main(String[] args) {
        Fish fish = new Fish();
        Boat boat = new Boat();
        SwimExecutor swimExecutor = new SwimExecutor();
        swimExecutor.makeSwim(fish);
        swimExecutor.makeSwim(boat);
    }
}