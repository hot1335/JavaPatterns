package biz.baijing.proxy.cglib;

import biz.baijing.proxy.dynamic.ProxyFactory;
import biz.baijing.proxy.dynamic.Trade;

public class CustomerRun {
    public static void main(String[] args) {

        // 代理工厂对象
        ProxyFactory factory = new ProxyFactory();

        // 获取代理对象
        Trade proxyObject = factory.getProxyObject();

        // Sell ，调用代理对象的方法
        proxyObject.sell();

    }
}
