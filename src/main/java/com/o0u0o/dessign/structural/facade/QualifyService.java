package com.o0u0o.dessign.structural.facade;

/**
 * 模拟资格校验子系统
 * @author o0u0o
 * @date 2021/7/20 3:11 下午
 */
public class QualifyService {

    /**
     * 资格校验
     * @param pointsGift
     * @return
     */
    public boolean isAvailable(PointsGift pointsGift){
        System.out.println("校验" + pointsGift.getName() + " 积分资格通过，库存通过");
        return true;
    }



}
