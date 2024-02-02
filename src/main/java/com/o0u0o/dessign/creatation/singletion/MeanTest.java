package com.o0u0o.dessign.creatation.singletion;

/**
 * <h1></h1>
 * ClassName: MeanTest
 * Description:
 *
 * @author o0u0o
 * @since  2024/2/2 11:04 AM
 */
public class MeanTest {
    public static void main(String[] args) {
        Person boss_1 = Person.boss();

        Person boss_2 = Person.boss();

        System.out.println(boss_1 == boss_2);

    }
}
