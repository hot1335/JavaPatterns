package biz.baijing.factory;

/**
 * 工厂模式
 * @version 0.1
 * @author  BaiJing.biz
 */
public class MilkTeaStore {

    public MilkTea orderMilkTea(String taste){

        // 声明口味变量，声明子类对象
        MilkTea milkTea = null;

        if(taste.equals("tai")){
            milkTea = new TaiMilkTea();
        }else if(taste.equals("lu")){
            milkTea = new LuMilkTea();
        }

        if(milkTea == null){
            throw  new RuntimeException("输入的口味不对。");
        }

        milkTea.addMilk();
        milkTea.addSuger();

        return milkTea;
    }
}
