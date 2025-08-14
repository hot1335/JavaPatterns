package biz.baijing.command;

/**
 * 命令模式 - 厨师
 * @version 0.1
 * @author  BaiJing.biz
 */
public class Cook {

    public void makeCook(String dishesName,int num) {
        System.out.println(dishesName + " 菜品  -- " + num + "份。");
    }

}
