package biz.baijing.template;

/**
 * 模板方法 - 子类
 * @version 0.1
 * @author  BaiJing.biz
 */
public class ApartmentCheckin extends Checkin {
    @Override
    public void balancePayment(int balance) {
        System.out.println("支付尾款: " + balance + " 支付押金 200元");
    }
}
