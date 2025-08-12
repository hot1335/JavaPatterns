package biz.baijing.adapter.classadapter;

/**
 * 适配器模式 - 硬盘盒子，进行数据读取
 * @version 0.1
 * @author  BaiJing.biz
 */
public class HarddiskBox {
    // 从IDE硬盘读取数据
    public String readIDE(IDEHarddisk harddisk) {
        if (harddisk == null) {
            return "IDEHarddisk is null;Error !!!";
        }
        return harddisk.readIDE();
    }
}
