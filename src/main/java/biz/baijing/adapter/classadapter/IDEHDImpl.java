package biz.baijing.adapter.classadapter;

/**
 * 适配器模式 - 目标实现类
 * @version 0.1
 * @author  BaiJing.biz
 */
public class IDEHDImpl implements IDEHarddisk {
    @Override
    public String readIDE() {
        return "read IDE Harddisk Data ...";
    }

    @Override
    public void writeIDE(String ide) {
        System.out.println("write IDE Harddisk Data ..." + ide);
    }
}
