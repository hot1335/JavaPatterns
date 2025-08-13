package biz.baijing.interpreter;

/**
 * 解释器模式 - 变量类
 * @version 0.1
 * @author  BaiJing.biz
 */
public class Variable extends Expression {

    // 成员变量名称 - 用于存储表达式的变量名
    private String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public int interpret(Context context) {
        return context.get(this);
    }

    @Override
    public String toString() {
        return name;
    }
}
