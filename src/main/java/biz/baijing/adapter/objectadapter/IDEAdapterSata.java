package biz.baijing.adapter.objectadapter;

/**
 * 适配器模式 - 适配器类
 * @version 0.1
 * @author  BaiJing.biz
 */
public class IDEAdapterSata  implements IDEHarddisk {

    // 声明适配者类
    private SataHarddisk sataHarddisk;
    public IDEAdapterSata(SataHarddisk sataHarddisk) {
        this.sataHarddisk = sataHarddisk;
    }

    // 从 Sata 中读取数据，通过转换器变成 IDE 读取
    @Override
    public String readIDE() {
        System.out.println("read SATA（IDE） Adapter");
        return sataHarddisk.readSata();
    }

    @Override
    public void writeIDE(String sata) {
        System.out.println("write SATA(IDE) Adapter ");
        sataHarddisk.writeSata(sata);
    }
}
