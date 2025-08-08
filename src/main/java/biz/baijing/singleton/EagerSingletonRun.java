package biz.baijing.singleton;

public class EagerSingletonRun {
    public static void main(String[] args) {

        EagerSingletonStaticVariable instance = EagerSingletonStaticVariable.getInstance();

        EagerSingletonStaticVariable instance1 = EagerSingletonStaticVariable.getInstance();

        System.out.println(instance == instance1 );

        instance.showSu();

    }
}
