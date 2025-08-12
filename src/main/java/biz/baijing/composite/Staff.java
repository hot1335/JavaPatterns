package biz.baijing.composite;

/**
 * 组合模式 - 叶子节点
 * @version 0.1
 * @author  BaiJing.biz
 */
public class Staff extends Department {

    public Staff(String name,int level) {
        this.name = name;
        this.level = level;
    }

}
