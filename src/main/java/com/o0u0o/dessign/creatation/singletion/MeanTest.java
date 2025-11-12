package com.o0u0o.dessign.creatation.singletion;


import java.util.Map;
import java.util.Properties;

/**
 * <h1>测试类</h1>
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

        //因为是单例模式，只会new一个实例，所以此时结构为：true
        System.out.println(boss_1 == boss_2);

        // ====== 单例模式的应用 ======
        //获取当前系统的信息（直接通过System去调用方法）
        Properties properties = System.getProperties();
        System.out.println("系统信息:" + properties);

        //获取当前系统的环境变量
        Map<String, String> getenv = System.getenv();
        System.out.println("环境变量:" + getenv);


    }
}
