package dk.proxy.pattern.noInterface;

import org.springframework.stereotype.Component;

@Component
public class NIClient {
    public void run(){
        NIGamePlayProxy nigpp = new NIGamePlayProxy();
        nigpp.playGame();
    }
}
