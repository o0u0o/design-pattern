package com.o0u0o.dessign.principle.interfacesegregation;

/**
 * TODO
 *
 * @author mac
 * @date 2022/2/11 5:16 PM
 */
public class Dog implements IEatAnimalAction,ISwimAnimalAction {
    @Override
    public void eat() {
        System.out.println("可以吃");
    }

    @Override
    public void swim() {
        System.out.println("可以游泳");
    }
}
