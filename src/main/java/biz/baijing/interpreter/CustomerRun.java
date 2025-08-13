package biz.baijing.interpreter;

public class CustomerRun {
    public static void main(String[] args) {

        Context context = new Context();

        Variable a = new Variable("a");
        Variable b = new Variable("b");
        Variable c = new Variable("c");
        Variable d = new Variable("d");
        Variable e = new Variable("e");

        context.addTo(a,2);
        context.addTo(b,3);
        context.addTo(c,22);
        context.addTo(d,10);
        context.addTo(e,9);

        // 抽象语法树
        Expression expression = new Plus(a,new Plus(new Plus(e,d),new Minus(d,e)));

        // 计算
        int interpret = expression.interpret(context);
        System.out.println(interpret);

    }
}
