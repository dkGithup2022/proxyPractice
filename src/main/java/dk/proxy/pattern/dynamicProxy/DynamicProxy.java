package dk.proxy.pattern.dynamicProxy;

import dk.proxy.pattern.yesInterface.YIGamePlay;
import dk.proxy.pattern.yesInterface.YIGamePlayImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy {

    public static void main(String[] args) {
        DynamicProxy dp = new DynamicProxy();
        dp.run();

    }

    public void run(){
        YIGamePlay gamePlayProxy = getGamePlayProxy(new YIGamePlayImpl());
        gamePlayProxy.playGame();
    }

    private YIGamePlay getGamePlayProxy(YIGamePlay target) {
        return (YIGamePlay) Proxy.newProxyInstance(
                getClass().getClassLoader(),
                new Class[]{YIGamePlay.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("before invoke");
                        method.invoke(target, args);
                        System.out.println("after invoke");
                        return null;
                    }
                }
        );
    }
}
