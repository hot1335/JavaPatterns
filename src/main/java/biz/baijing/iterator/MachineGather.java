package biz.baijing.iterator;

/**
 * 迭代器模式 - 抽象聚合角色接口
 * @version 0.1
 * @author  BaiJing.biz
 */
public interface MachineGather {

    // 添加设备
    void addMachine(Machine machine);

    // 删除设备
    void removeMachine(Machine machine);

    // 获取迭代器对象
    MachineIterator getMachineIterator();

}
