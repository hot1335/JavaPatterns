package biz.baijing.adapter.objectadapter;

/**
 * 适配器模式 - 适配者类实现类
 * @version 0.1
 * @author  BaiJing.biz
 */
public class SataHDImpl implements SataHarddisk {
    @Override
    public String readSata() {
        return "Read Sata Harddisk Data ...";
    }

    @Override
    public void writeSata(String sata) {
        System.out.println("Write Sata Harddisk Data ..." + sata);
    }
}
