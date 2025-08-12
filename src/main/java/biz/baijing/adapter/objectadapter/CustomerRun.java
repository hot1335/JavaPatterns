package biz.baijing.adapter.objectadapter;

public class CustomerRun {
    public static void main(String[] args) {

        HarddiskBox harddiskBox = new HarddiskBox();

        String ide = harddiskBox.readIDE(new IDEHDImpl());
        System.out.println(ide);

        System.out.println("适配器模式");

        // 读取 SATA 数据
        String data = harddiskBox.readIDE(new IDEAdapterSata(new SataHDImpl()));
        System.out.println(data);
    }
}
