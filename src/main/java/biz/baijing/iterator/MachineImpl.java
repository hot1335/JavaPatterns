package biz.baijing.iterator;

import java.util.List;

/**
 * 迭代器模式 - 具体迭代器角色类
 * @version 0.1
 * @author  BaiJing.biz
 */
public class MachineImpl implements MachineIterator{

    private List<Machine> machines;
    private int position = 0;      // 遍历位置

    public MachineImpl(List<Machine> machines) {
        this.machines = machines;
    }

    @Override
    public boolean hasNext() {
        return position < machines.size();
    }

    @Override
    public Machine next() {
        // 获取集合具体位置的元素
        Machine nowMachine = machines.get(position);
        position++;
        return nowMachine;
    }
}
