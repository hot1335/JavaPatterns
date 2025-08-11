package biz.baijing.builder;

/**
 * 建造者 - 商品类
 * @version 0.1
 * @author  BaiJing.biz
 */
public class Desklamp {

    private String lightstand; // 灯架
    private String lightswitch; // 开关

    protected Desklamp() {
    }

    public String getLightstand() {
        return lightstand;
    }

    public void setLightstand(String lightstand) {
        this.lightstand = lightstand;
    }

    public String getLightswitch() {
        return lightswitch;
    }

    public void setLightswitch(String lightswitch) {
        this.lightswitch = lightswitch;
    }

    @Override
    public String toString() {
        return "Desklamp{" +
                "lightstand='" + lightstand + '\'' +
                ", lightswitch='" + lightswitch + '\'' +
                '}';
    }
}
