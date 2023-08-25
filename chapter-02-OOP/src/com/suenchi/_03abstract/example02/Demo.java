package com.suenchi._03abstract.example02;

public class Demo {
    public static void main(String[] args) {
        Composition composition=new CompositionA();
        composition.write("向前走,莫停留,追求更多的选择和自由");
        composition=new CompositionB();
        composition.write("当年明月");
    }
}