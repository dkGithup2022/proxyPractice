package dk.proxy.pattern;

import dk.proxy.pattern.aopProxy.GameComponent;
import dk.proxy.pattern.dynamicProxy.DynamicProxy;
import dk.proxy.pattern.noInterface.NIClient;
import dk.proxy.pattern.yesInterface.YIClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@Component
public class SandBox implements ApplicationRunner {

    @Autowired
    GameComponent gameComponent;
    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println("\nno interface proxy ");
        NIClient niClient = new NIClient();
        niClient.run();

        System.out.println("\ninterface proxy");
        YIClient yiClient = new YIClient();
        yiClient.run();

        System.out.println("\ndynamic proxy");
        DynamicProxy dp = new DynamicProxy();
        dp.run();

        System.out.println("\nAOP proxied");
        gameComponent.run();

    }
}
