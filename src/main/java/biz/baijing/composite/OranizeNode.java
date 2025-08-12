package biz.baijing.composite;

/**
 * 组合模式 - 叶子节点
 * @version 0.1
 * @author  BaiJing.biz
 */
public class OranizeNode extends Department {

    public OranizeNode(String name,int level) {
        this.name = name;
        this.level = level;
    }
}
