package biz.baijing.mediator;

public class CustomerRun {
    public static void main(String[] args) {

        MediatorReal mediatorReal = new MediatorReal();

        Owner owner = new Owner("Tom",mediatorReal);
        Lessee lessee = new Lessee("天水",mediatorReal);

        // 中介者和设备拥有者与租赁者的关系
        mediatorReal.setOwner(owner);
        mediatorReal.setLessee(lessee);

        lessee.contact("有挖掘机出租吗 ？");
        owner.contact("单台挖掘机，3000元/天。");


    }
}
