package com.o0u0o.dessign.creatation.prototype;

/**
 * <h1>原型模式测试类</h1>
 * ClassName: MainTest
 * Description:
 * 场景设置：自己设计了一个类似于MyBatis框架，去操作数据库
 * 1、设计一个名为HiBatis：操作数据库，从数据库里面查询很多记录（数据库中70%记录改变很少）
 * 2、每次查询数据库，查到以后把所有数据都封装成一个对象，返回
 * 3、这样会就有一个问题，1w个线程，同时去查询一个记录 new User("zhangsan", 8), 每次创建一个对象封装并返回，此时，系统就会有1w个User。非常浪费内存！！！
 * 4、解决：设计一个缓存，查过的就保存。再次查相同记录，拿到原来的原型对象。
 * 5、此时直接从缓存在获取，但是存在危险的地方
 *
 * @author  o0u0o
 * @since  2024/2/5 10:08 AM
 */
public class MainTest {

    public static void main(String[] args) throws CloneNotSupportedException {

        //
        HiBatis hiBatis = new HiBatis();
        User user1 = hiBatis.getUser("张三");
        user1.setUsername("张麻子");
        System.out.println("user1 -> " + user1.getUsername());

        User user2 = hiBatis.getUser("张三");
        System.out.println("user2 -> " + user2.getUsername());

        User user3 = hiBatis.getUser("张三");
        System.out.println("user3 -> " + user3.getUsername());

        User user4 = hiBatis.getUser("张三");
        System.out.println("user4 -> " + user4.getUsername());

        User user5 = hiBatis.getUser("张三");
        System.out.println("user5 -> " + user5.getUsername());

    }

}
