package biz.baijing.builder;

/**
 * 建造者 - 具体建造者
 * @version 0.1
 * @author  BaiJing.biz
 */
public class XiaomiBuilder extends Builder {


    @Override
    public void buildLightstand() {
        desklamp.setLightstand("床头灯");
    }

    @Override
    public void buildLightswitch() {
        desklamp.setLightswitch("按钮开关");
    }

    @Override
    public Desklamp initDesklamp() {
        return desklamp;
    }
}
