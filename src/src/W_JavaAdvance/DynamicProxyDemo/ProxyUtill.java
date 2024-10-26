package W_JavaAdvance.DynamicProxyDemo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtill {
    public static Star createProxy(BigStar bigStar){
        Star starProxy = (Star) Proxy.newProxyInstance(ProxyUtill.class.getClassLoader(),
                new Class[]{Star.class}, new InvocationHandler() {
                    @Override//回调方法
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //代理对象要做的事情，会在这里写代码
                        if(method.getName().equals("sing")){
                            System.out.println("话筒，收钱");
                        }else if (method.getName().equals("dance")){
                            System.out.println("收钱");
                        }
                        return method.invoke(bigStar,args);
                    }
                });
        return starProxy;
    }
}
