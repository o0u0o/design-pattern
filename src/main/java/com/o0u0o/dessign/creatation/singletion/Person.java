package com.o0u0o.dessign.creatation.singletion;

/**
 * <h1>单例模式演示</h1>
 * ClassName: Person
 * Description:
 *
 * @author o0u0o
 * @since 2024/2/2 11:05 AM
 */
public class Person {

    private String name;

    private String age;

    /**
     * 懒汉没模式 需要的时候再 new
     * volatile:内存可见性
     * 为啥要加volatile(内存可见性)，因为即便是加了synchronized锁，也会出现指令重排
     */
    private volatile static Person instance;

    // 饿汉模式: 一上来就要 new
    // 饿汉模式是线程安全的：因为JVM在类加载的过程，保证了不会初始化多个static对象
    //private final static Person instance = new Person();

    /**
     * 单例模式：要保证构造器私有，外部就无法实例化
     */
    private Person() {
        System.out.println("创建了Person");
    }


    /**
     * 单例模式：提供给外部的方法。会有多线程问题
     * 1、 public static synchronized Person boss() 直接锁方法锁太大影响效率
     * 2、双重检查锁+volatile内存可见性（）
     * @return
     */
    public static Person boss(){
        //如果没有实例，再去创建（比如8个线程都进来，同时判断都是null，同时进入第二行。会出现问题）
        if (instance == null){
            synchronized (Person.class){
                if (instance == null){
                    //此处依旧不安全，因为存在指令重排问题。需要加上内存可见性volatile
                    Person person = new Person();
                    instance = person;
                }
            }

        }
        return instance;
    }
}
