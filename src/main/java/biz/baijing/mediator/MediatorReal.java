package biz.baijing.mediator;

/**
 * 中介者模式 - 中介者具体类
 * @version 0.1
 * @author  BaiJing.biz
 */
public class MediatorReal extends Mediator {

    private Owner owner;
    private Lessee lessee;

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Lessee getLessee() {
        return lessee;
    }

    public void setLessee(Lessee lessee) {
        this.lessee = lessee;
    }

    @Override
    public void contact(String msg, Person person) {
        if(person instanceof Lessee){
            lessee.getMessage(msg);
        }
        if (person instanceof Owner) {
            owner.getMessage(msg);
        }
    }
}
