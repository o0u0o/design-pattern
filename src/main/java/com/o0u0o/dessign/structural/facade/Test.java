package com.o0u0o.dessign.structural.facade;

/**
 * TODO
 *
 * @author mac
 * @date 2021/7/20 3:39 下午
 */
public class Test {
    public static void main(String[] args) {
        PointsGift  pointsGift = new PointsGift("衬衣");
        GiftExchangeService giftExchangeService = new GiftExchangeService();

        giftExchangeService.setQualifyService(new QualifyService());
        giftExchangeService.setShippingService(new ShippingService());
        giftExchangeService.setPointsPaymentService(new PointsPaymentService());

        giftExchangeService.giftExchange(pointsGift);
    }
}
