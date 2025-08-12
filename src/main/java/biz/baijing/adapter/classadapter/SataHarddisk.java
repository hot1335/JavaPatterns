package biz.baijing.adapter.classadapter;

/**
 * 适配器模式 - 适配者类接口
 * @version 0.1
 * @author  BaiJing.biz
 */
public interface SataHarddisk {
    // 读取数据
    String readSata();
    // 写入数据
    void writeSata(String sata);
}
