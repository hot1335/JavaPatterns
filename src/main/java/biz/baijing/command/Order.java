package biz.baijing.command;

import java.util.HashMap;
import java.util.Map;

/**
 * 命令模式 - 订单类
 * @version 0.1
 * @author  BaiJing.biz
 */
public class Order {

    // 台号
    private String tableId;
    // 菜品和菜份
    private Map<String,Integer> dishesAndNum =  new HashMap<String,Integer>();

    public String getTableId() {
        return tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    public Map<String, Integer> getDishesAndNum() {
        return dishesAndNum;
    }

    // 调整为下面的 setDishesList
    public void setDishesAndNum(Map<String, Integer> dishesAndNum) {
        this.dishesAndNum = dishesAndNum;
    }

    // 设置点菜列表的菜品和数量
    public void setDishesList(String dishesName,int num){
        dishesAndNum.put(dishesName,num);
    }
}
