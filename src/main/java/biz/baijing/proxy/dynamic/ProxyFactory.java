package biz.baijing.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理 - 获取代理对象的工厂类
 * @version 0.1
 * @author  BaiJing.biz
 */
public class ProxyFactory {

    // 生成目标对象
    private AgentOutlets agentOutlets = new AgentOutlets();

    // 获取代理对象
    public Trade getProxyObject() {
        // 返回代理对象
        /*
               JDK 提供了 proxy 类，用于动态代理用于创建代理对象的方法
               newProxyInstance 有三个参数：
                    - ClassLoader loader ： 类加载器，加载代理类，通过目标对象获取
                    - Class<?>[] interfaces ：代理类实现的接口的字节码对象
                    - InvocationHandler h ： 代理对象的调用处理方法
         */
        Trade proxyObject = (Trade) Proxy.newProxyInstance(
                agentOutlets.getClass().getClassLoader(),
                agentOutlets.getClass().getInterfaces(),
                new InvocationHandler() {
                    /*
                        Object proxy ： 代理对象，同 proxyObject 是同一个对象
                        Method method ： 对接口中的方法进行封装的方法（method）对象，这里就是 sell 方法
                        Object[] args ： 待用方法的实际参数

                        return : 返回值就是方法的返回值，这里是 sell 的返回值
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("InvocationHandler 的 invoke 方法执行 ...");
                        // 分销店的业务逻辑，收取服务费
                        System.out.println("Distribution 加收收 Distribution Outlets 服务费 ！！！（动态代理）");
                        // 执行目标对象的方法 (反射）
                        Object object = method.invoke(agentOutlets, args);
                        return object;
                    }
                }
        );
        return proxyObject;
    }
}
