package com.suenchi._03abstract.example01;

public class Demo {
    public static void main(String[] args) {
        Animal animal;
        animal=new Dog();
        func(animal);
        animal = new Cat();
        func(animal);
    }
    public static void func(Animal animal){
        animal.eat();
    }
}