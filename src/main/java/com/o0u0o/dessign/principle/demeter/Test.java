package com.o0u0o.dessign.principle.demeter;

/**
 * 测试类
 * @author mac
 * @date 2022/2/22 10:22 AM
 */
public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss();
        Teamleader teamleader = new Teamleader();

        boss.commandCheckNumber(teamleader);
    }
}
