package biz.baijing.command;

import java.util.Map;
import java.util.Set;

/**
 * 命令模式 - 实例命令类
 * @version 0.1
 * @author  BaiJing.biz
 */
public class OrderCommand implements Command {

    // 接受者对象 (receiver)
    private Cook cook;
    // 订单
    private Order order;

    public OrderCommand(Order order, Cook cook) {
        this.order = order;
        this.cook = cook;
    }

    @Override
    public void doDishes() {
        System.out.println(order.getTableId() + " 桌，订单： ");
        Map<String, Integer> dishesList  = order.getDishesAndNum();
        // 展示菜单列表
        Set<String> keys = dishesList.keySet();
        for (String dishesName : keys) {
            cook.makeCook(dishesName, dishesList.get(dishesName));
        }

        System.out.println(order.getTableId() + "桌菜品已经准备完成。上菜。");
    }
}
