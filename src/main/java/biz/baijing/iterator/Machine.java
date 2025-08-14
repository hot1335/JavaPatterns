package biz.baijing.iterator;

/**
 * 迭代器模式 -
 * @version 0.1
 * @author  BaiJing.biz
 */
public class Machine {

    private String  name;
    private String  serialNumber;

    public Machine(String name, String serialNumber) {
        this.name = name;
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Machine{" +
                "name='" + name + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }
}
