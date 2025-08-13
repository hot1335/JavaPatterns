package biz.baijing.visitor;

public class CustomerRun {
    public static void main(String[] args) {

        MaoKaStore maoKaStore = new MaoKaStore();

        maoKaStore.addAnimal(new Cat());
        maoKaStore.addAnimal(new Cat());
        maoKaStore.addAnimal(new Dog());

        Owner owner = new Owner();

        maoKaStore.action(owner);


    }
}
