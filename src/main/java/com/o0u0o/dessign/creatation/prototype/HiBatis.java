package com.o0u0o.dessign.creatation.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * <h1></h1>
 * ClassName: HiBatis
 * Description:
 *
 * @Author o0u0o
 * @Date 2024/2/5 10:14 AM
 */
public class HiBatis {

    // 定义一个用户缓存
    private Map<String, User> userCache = new HashMap<>();

    /**
     * 模拟从数据库查数据
     */
    public User getUser(String username) throws CloneNotSupportedException {
        //缓存判断,如果没有包含，就从数据库查询
        if (!userCache.containsKey(username)){
            User user = getUserFromDB(username);
            return user;
        }

        //如果包含，就从缓存中获取（从缓存中直接拿，就会导致脏缓存的问题）- 拿到的是本人
        //正确做法是需要从这个对象中，快速得到克隆体（拿到克隆人）。
        User user = userCache.get(username);
        User clone = (User)user.clone();
        return clone;
    };


    /**
     * <h2>模拟从数据库查询数据</h2>
     * @param username 用户名
     * @return
     */
    private User getUserFromDB(String username) throws CloneNotSupportedException {
        System.out.println("从数据库查" + username + "并且创建对象");
        User user = new User();
        user.setUsername("张三");
        user.setAge(18);
        //查询后放在缓存中 给缓存中放一个clone
        userCache.put(username, (User)user.clone());
        return user;
    }
}
