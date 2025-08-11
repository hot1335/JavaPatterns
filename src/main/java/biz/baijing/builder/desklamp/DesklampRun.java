package biz.baijing.builder.desklamp;

public class DesklampRun {
    public static void main(String[] args) {

        // 通过创建者创建 desklamp 对象
        Desklamp initDesklamp = new Desklamp.Builder()
                                    .setCpu("AMD")
                                    .setFan("爱国者")
                                    .setKeyboard("技嘉")
                                    .setMemory("闪迪")
                                    .setScreen("京东方 BOE")
                                    .setName("我的笔记本 。。 ")
                                    .init();


        System.out.println(initDesklamp.toString());
    }
}
