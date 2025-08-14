package biz.baijing.command;

public class CustomerRun {
    public static void main(String[] args) {

        // 订单
        Order o1  = new Order();
        Order o2  = new Order();

        // 初始化 菜单list
        o1.setTableId("01");
        o1.setDishesList("薄荷牛肉",1);
        o1.setDishesList("清汤面",1);
        o1.setDishesList("凉啤酒",2);

        o2.setTableId("02");
        o2.setDishesList("川味烤鱼",1);
        o2.setDishesList("米饭",3);
        o2.setDishesList("热米酒",3);


        // 厨师
        Cook cook = new Cook();

        OrderCommand c1 = new OrderCommand(o1,cook);
        OrderCommand c2 = new OrderCommand(o2,cook);

        // 服务员
        Waiter waiter = new Waiter();

        waiter.setCommand(c1);
        waiter.setCommand(c2);

        // 服务员对厨师发命令
        waiter.sayOrder();

    }
}
