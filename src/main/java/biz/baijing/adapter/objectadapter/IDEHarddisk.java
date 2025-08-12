package biz.baijing.adapter.objectadapter;

/**
 * 适配器模式 - 目标接口
 * @version 0.1
 * @author  BaiJing.biz
 */
public interface IDEHarddisk {
    // 读取数据
    String readIDE();
    // 写入数据
    void writeIDE(String ide);
}
