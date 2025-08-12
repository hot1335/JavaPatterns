package biz.baijing.decorator;

public class CustomerRun {
    public static void main(String[] args) {

        ShoutaoCake shoutaoCake = new ShoutaoCake();

        System.out.println(shoutaoCake.getName() +" - " + shoutaoCake.cost());

        // 寿桃蛋糕，增加 Apple
        Apple apple = new Apple(shoutaoCake);

        System.out.println(apple.getName() +" - " + apple.cost());

    }
}
