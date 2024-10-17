package ru.itgirlschool.week4.entity;

public class Fish implements Swimming {
    @Override
    public void swim() {
        eat();
        System.out.println("Я рыбка буль-буль и я плыву");
    }

    private void eat() {
        System.out.println("Я рыбка и для того, чтобы плыть, мне нужно поесть. Ням-ням");
    }
}