package biz.baijing.flyweight;

/**
 * 享元模式 - 抽象享元类
 * @version 0.1
 * @author  BaiJing.biz
 */
public abstract class ShareBike {

    // 自行车状态
    public abstract int getBikeStatus(int status);

    // 开锁 和 关锁
    public void On(int status){
        if (status == 1) {
            System.out.println("已经开启，可骑行。");
        } else {
            System.out.println("请开锁。");
        }
    }

    public void Off(int status){
        if (status == 0) {
            System.out.println("已经关闭，可离开。");
        } else {
            System.out.println("请关锁。");
        }
    }

}
