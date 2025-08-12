package biz.baijing.composite;

public class CustomerRun {
    public static void main(String[] args) {

        Department d1 = new Organize("人力资源",2);

        Department d2 = new Organize("IT技术部",2);
        d2.add(new OranizeNode("前端开发",3));

        

    }
}
