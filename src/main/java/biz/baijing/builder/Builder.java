package biz.baijing.builder;

/**
 * 建造者 - 构建者
 * @version 0.1
 * @author  BaiJing.biz
 */
public abstract class Builder {

    // 创建 台灯 Desk lamp
    protected Desklamp desklamp = new Desklamp();

    public abstract void buildLightstand();

    public abstract void buildLightswitch();

    // 构建台灯
    public abstract Desklamp initDesklamp();

}
