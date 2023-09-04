package com.itheima.a01interfacedemo1;

public class Dog extends Animal implements Swim{
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    @Override
    public void swim() {
        System.out.println("狗刨");
    }
}
