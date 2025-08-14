package biz.baijing.iterator;

public class CustomerRun {
    public static void main(String[] args) {

        MachineGatherImpl machineGather = new MachineGatherImpl();

        machineGather.addMachine(new Machine("挖掘机","101110001"));
        machineGather.addMachine(new Machine("吊塔","12099937"));
        machineGather.addMachine(new Machine("挖掘机","10112366001"));
        machineGather.addMachine(new Machine("压路机","12767837"));
        machineGather.addMachine(new Machine("挖掘机","1011212001"));
        machineGather.addMachine(new Machine("压路机","1208880937"));

        MachineIterator machineIterator = machineGather.getMachineIterator();
        while (machineIterator.hasNext()) {
            Machine machine = machineIterator.next();
            System.out.println(machine.toString());
        }

    }
}
