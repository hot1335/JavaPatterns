package biz.baijing.factory.simplefactory;

import biz.baijing.factory.originalmode.LuMilkTea;
import biz.baijing.factory.originalmode.MilkTea;
import biz.baijing.factory.originalmode.TaiMilkTea;

/**
 * 工厂模式 - 生产奶茶
 * @version 0.1
 * @author  BaiJing.biz
 */
public class MilkTeaSimpleFactory {

    public MilkTea initMilkTea(String taste){

        MilkTea milkTea = null;

        if(taste.equals("tai")){
            milkTea = new TaiMilkTea();
        }else if(taste.equals("lu")){
            milkTea = new LuMilkTea();
        }

        return milkTea;
    }
}
