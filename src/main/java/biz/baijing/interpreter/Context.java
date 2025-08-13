package biz.baijing.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * 解释器模式 - 环境角色类
 * @version 0.1
 * @author  BaiJing.biz
 */
public class Context {

    // 存储变量和值
    private Map<Variable,Integer> map = new HashMap<>();

    // 添加变量
    public void  addTo(Variable variable, int value) {
        map.put(variable, value);
    }

    // 根据变量获取值
    public int get(Variable variable) {
        return map.get(variable);
    }

}
