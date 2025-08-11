package biz.baijing.builder.desklamp;

/**
 * 建造者 - 产品类
 * @version 0.1
 * @author  BaiJing.biz
 */
public class Desklamp {

    private String name;
    private String cpu;
    private String memory;
    private String screen;
    private String keyboard;
    private String fan;

    public static final class Builder {
        private String name;
        private String cpu;
        private String memory;
        private String screen;
        private String keyboard;
        private String fan;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }
        public Builder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }
        public Builder setMemory(String memory) {
            this.memory = memory;
            return this;
        }
        public Builder setScreen(String screen) {
            this.screen = screen;
            return this;
        }
        public Builder setKeyboard(String keyboard) {
            this.keyboard = keyboard;
            return this;
        }
        public Builder setFan(String fan) {
            this.fan = fan;
            return this;
        }

        // 使用构建者创建 desklamp
        public Desklamp init() {
            return new Desklamp(this);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "name='" + name + '\'' +
                    ", cpu='" + cpu + '\'' +
                    ", memory='" + memory + '\'' +
                    ", screen='" + screen + '\'' +
                    ", keyboard='" + keyboard + '\'' +
                    ", fan='" + fan + '\'' +
                    '}';
        }
    }

    private Desklamp(Builder builder) {
        this.name = builder.name;
        this.cpu = builder.cpu;
        this.memory = builder.memory;
        this.screen = builder.screen;
        this.keyboard = builder.keyboard;
        this.fan = builder.fan;

    }
}
