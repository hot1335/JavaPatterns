package biz.baijing.flyweight;

import java.util.HashMap;

/**
 * 享元模式 - 单例工厂类
 * @version 0.1
 * @author  BaiJing.biz
 */
public class BikeFactory {

    private HashMap<Integer,ShareBike> map;

    public BikeFactory() {
        map = new HashMap<Integer,ShareBike>();
        map.put(1,new AlibabaBike());
        map.put(2,new MeituanBike());
        map.put(3,new AlibabaBike());
    }

    private static BikeFactory instance = new BikeFactory();
    // 获取工厂的方法
    public static  BikeFactory getBikeFactoryInstance(){
        return instance;
    }

    public ShareBike getShareBike(int bikeId) {
        return map.get(bikeId);
    }

}
