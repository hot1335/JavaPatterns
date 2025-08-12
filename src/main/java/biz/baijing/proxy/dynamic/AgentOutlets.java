package biz.baijing.proxy.dynamic;

/**
 * 动态代理 - 代理商网点
 * @version 0.1
 * @author  BaiJing.biz
 */
public class AgentOutlets implements Trade {
    @Override
    public void sell() {
        System.out.println("Agent 代理商销售商品");
    }
}
