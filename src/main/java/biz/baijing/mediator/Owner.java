package biz.baijing.mediator;

/**
 * 中介者模式 - 具体同事类
 * @version 0.1
 * @author  BaiJing.biz
 */
public class Owner extends Person{
    public Owner(String name, Mediator mediator) {
        super(name, mediator);
    }

    // 和中介沟通的方法
    public void contact(String msg){
        mediator.contact(msg,this);
    }

    // 获取信息
    public void getMessage(String msg){
        System.out.println("设备拥有者" + name + "信息：" + msg);
    }
}
