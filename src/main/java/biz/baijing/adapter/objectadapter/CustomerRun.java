package biz.baijing.adapter.objectadapter;

public class CustomerRun {
    public static void main(String[] args) {

        HarddiskBox harddiskBox = new HarddiskBox();

        String ide = harddiskBox.readIDE(new IDEHDImpl());
        System.out.println(ide);

        System.out.println("适配器模式");

        String ide_sata_data = harddiskBox.readIDE(new IDEAdapterSata());
        System.out.println(ide_sata_data);

    }
}
