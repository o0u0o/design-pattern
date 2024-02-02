package com.o0u0o.dessign.structural.facade;

/**
 * 模拟积分支付子系统
 * @author o0u0o
 * @date 2021/7/20 3:15 下午
 */
public class PointsPaymentService {
    public boolean pay(PointsGift pointsGift){
        //扣减积分
        System.out.println("支付" + pointsGift.getName() +" 积分成功");
        return true;
    }
}
