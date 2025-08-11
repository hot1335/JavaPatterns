package biz.baijing.builder;

/**
 * 建造者 - 指挥者
 * @version 0.1
 * @author  BaiJing.biz
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    // 组装台灯
    public Desklamp assemble() {

        builder.buildLightswitch();
        builder.buildLightstand();

        return builder.initDesklamp();
    }
}
