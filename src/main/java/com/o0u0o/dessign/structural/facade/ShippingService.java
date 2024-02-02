package com.o0u0o.dessign.structural.facade;

/**
 * 模拟物流子系统
 * @author o0u0o
 * @date 2021/7/20 3:17 下午
 */
public class ShippingService {
    public String shipGift(PointsGift pointsGift){
        //物流系统的对接逻辑
        System.out.println(pointsGift.getName() + "进入物流");
        String shippingOrderNo = "666";
        return shippingOrderNo;
    }
}
