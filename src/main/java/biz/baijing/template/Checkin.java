package biz.baijing.template;

/**
 * 模板方法 - 抽象类
 * @version 0.1
 * @author  BaiJing.biz
 */
public abstract class Checkin {

    public final void checkinProcess(int balance) {
        showOrder(balance);
        balancePayment(balance);
        getCardInfo();
    }


    public  void showOrder(int balance)
    {
        if (balance == 0) {
            System.out.println("欢迎入住XXX酒店，请出示预订订单。");
        }
        if (balance > 0) {
            System.out.println("欢迎入住家庭式公寓项目，需支付" + balance  + "元。");
        }

    }

    public abstract void balancePayment(int balance);

    public void getCardInfo()
    {
        System.out.println("获得房卡信息；入住。");
    }

}
