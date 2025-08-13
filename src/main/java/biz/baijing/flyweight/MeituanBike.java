package biz.baijing.flyweight;

/**
 * 享元模式 - 抽象享元类具体角色
 * @version 0.1
 * @author  BaiJing.biz
 */
public class MeituanBike extends ShareBike{
    
    @Override
    public int getBikeStatus(int status) {
        return status;
    }
}
