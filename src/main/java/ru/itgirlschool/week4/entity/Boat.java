package ru.itgirlschool.week4.entity;

public class Boat implements Swimming {
    @Override
    public void swim() {
        fuel();
        System.out.println("Я корабль бррр и я плыву");
    }

    private void fuel() {
        System.out.println("Я корабль и для того, чтобы поплыть, мне нужно заправиться топливом. Ням-ням");
    }
}