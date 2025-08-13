package biz.baijing.interpreter;

/**
 * 解释器模式 - 抽象表达式
 * @version 0.1
 * @author  BaiJing.biz
 */
public abstract class Expression {

    public abstract int interpret(Context context);

}
