package biz.baijing.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 迭代器模式 - 具体迭代器接口
 * @version 0.1
 * @author  BaiJing.biz
 */
public class MachineGatherImpl implements MachineGather {

    private List<Machine> machines = new ArrayList<Machine>();

    @Override
    public void addMachine(Machine machine) {
        machines.add(machine);
    }

    @Override
    public void removeMachine(Machine machine) {
        machines.remove(machine);
    }

    @Override
    public MachineIterator getMachineIterator() {
        return new MachineImpl(machines);
    }
}
