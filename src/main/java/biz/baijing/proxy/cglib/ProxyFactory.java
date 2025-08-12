package biz.baijing.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;


/**
 * 动态代理 - CGLIB : 代理商网点
 * @version 0.1
 * @author  BaiJing.biz
 */
public class ProxyFactory implements MethodInterceptor {

    private AgentOutlets agentOutlets =  new AgentOutlets();

    public AgentOutlets getProxyObject() {
        // 创建 Enhancer 对象
        Enhancer enhancer = new Enhancer();

        // 父类的字节码对象
        enhancer.setSuperclass(AgentOutlets.class);

        // 设置回调函数 , this 子实现类对象
        enhancer.setCallback(this);

        // 创建代理对象
        AgentOutlets proxyObjcet = (AgentOutlets) enhancer.create();


        return  proxyObjcet;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("inetercept 执行中 ... ");
        System.out.println("CGLIB 代理，销售点收取服务费用 ...");
        // 调用目标对象的方法
        Object object = method.invoke(agentOutlets, objects);
        return object;
    }

}
