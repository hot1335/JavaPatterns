package biz.baijing.iterator;

/**
 * 迭代器模式 - 抽象迭代器接口
 * @version 0.1
 * @author  BaiJing.biz
 */
public interface MachineIterator {

    // 是否有元素
    boolean hasNext();

    // 获取下一个元素
    Machine next();

}
