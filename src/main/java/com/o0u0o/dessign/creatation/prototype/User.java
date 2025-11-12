package com.o0u0o.dessign.creatation.prototype;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * <h1>用户对象</h1>
 * ClassName: User
 * Description: 只需要在User类中实现一个Cloneable接口。
 * 1、表示当前对象是可克隆的
 * 2、然后自己去重写一下
 * @author o0u0o
 * @since  2024/2/5 10:15 AM
 */
@Getter
@Setter
@ToString
public class User implements Cloneable {

    private String username;

    private Integer age;

    public User(){
        System.out.println("对象User被创建");
    }


    /**
     * 重写克隆方法
     * 1、创建一个对象，再赋值
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        User user = new User();
        user.setUsername(this.username);
        user.setAge(this.age);
        return user;
    }
}
