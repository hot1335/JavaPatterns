package biz.baijing.interpreter;

/**
 * 解释器模式 - 加法表达式类
 * @version 0.1
 * @author  BaiJing.biz
 */
public class Plus extends Expression {

    private Expression left;
    private Expression right;

    public Plus(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        return left.interpret(context) + right.interpret(context);
    }

    @Override
    public String toString() {
        return  left.toString() + " + " +  right.toString();
    }
}
