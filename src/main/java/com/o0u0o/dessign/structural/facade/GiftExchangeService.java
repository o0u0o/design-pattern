package com.o0u0o.dessign.structural.facade;

/**
 * 礼物兑换
 * @author o0u0o
 * @date 2021/7/20 3:29 下午
 */
public class GiftExchangeService {

    private QualifyService qualifyService;
    private PointsPaymentService pointsPaymentService;
    private ShippingService shippingService;

    public void setQualifyService(QualifyService qualifyService) {
        this.qualifyService = qualifyService;
    }

    public void setPointsPaymentService(PointsPaymentService pointsPaymentService) {
        this.pointsPaymentService = pointsPaymentService;
    }

    public void setShippingService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public void giftExchange(PointsGift pointsGift){
        //资格校验通过
        if (!qualifyService.isAvailable(pointsGift)){
            System.out.printf("积分校验失败!");
        }

        //如果支付积分成功
        if (!pointsPaymentService.pay(pointsGift)){
            String shippingOrderNo = shippingService.shipGift(pointsGift);
            System.out.printf("物流系统下单成功，订单号" +  shippingOrderNo);
        }


    }
}
