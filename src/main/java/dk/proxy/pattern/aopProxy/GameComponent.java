package dk.proxy.pattern.aopProxy;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class GameComponent {
    public void run(){
        System.out.println("bean run ~");
    }
}
