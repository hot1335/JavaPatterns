package biz.baijing.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 访问者模式 - 对象结构类
 * @version 0.1
 * @author  BaiJing.biz
 */
public class MaoKaStore {

    private List<Animal> animals =  new ArrayList<Animal>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void action(Person visitor) {
        for (Animal animal : animals) {
            animal.accept(visitor);
        }
    }

}
