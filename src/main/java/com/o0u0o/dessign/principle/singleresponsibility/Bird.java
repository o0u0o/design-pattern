package com.o0u0o.dessign.principle.singleresponsibility;

/**
 * Bird类
 *
 * @author mac
 * @date 2022/2/11 4:34 PM
 */
public class Bird {

    public void mainMoveMode(String birdName){
        if ("鸵鸟".equals(birdName)){
            System.out.println(birdName + "用脚走");
        }
        else {
            System.out.println(birdName + "用翅膀飞");
        }

    }
}
