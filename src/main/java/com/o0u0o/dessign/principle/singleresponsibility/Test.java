package com.o0u0o.dessign.principle.singleresponsibility;

/**
 * TODO
 *
 * @author mac
 * @date 2022/2/11 4:36 PM
 */
public class Test {


    public static void main(String[] args) {
//        Bird bird = new Bird();
//        bird.mainMoveMode("大雁");
//        bird.mainMoveMode("鸵鸟");


        FlyBird flyBird = new FlyBird();
        flyBird.mainMoveMode("大雁");

        WalkBird walkBird = new WalkBird();
        walkBird.mainMoveMode("鸵鸟");
    }
}
