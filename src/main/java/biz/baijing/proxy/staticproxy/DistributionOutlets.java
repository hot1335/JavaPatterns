package biz.baijing.proxy.staticproxy;

/**
 * 静态代理 - 分销点（代理商的渠道）网点
 * @version 0.1
 * @author  BaiJing.biz
 */
public class DistributionOutlets implements Trade {

    // Distribution Outlets 的销售动作也是 Agent Outlets 出票出货的
    // 聚合
    private final AgentOutlets agentOutlets = new AgentOutlets();

    @Override
    public void sell() {
        System.out.println("Distribution 代理商分销点 - 销售商品。");
        System.out.println("Distribution 加收收 Distribution Outlets 服务费 ");
        agentOutlets.sell();
    }
}
