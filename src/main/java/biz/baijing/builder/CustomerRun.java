package biz.baijing.builder;

/**
 * 建造者 - 指挥者
 * @version 0.1
 * @author  BaiJing.biz
 */
public class CustomerRun {
    public static void main(String[] args) {

        Director director = new Director(new XiaomiBuilder());

        Desklamp d = director.assemble();

        System.out.println(d.getLightstand());
        System.out.println(d.getLightswitch());

    }
}
