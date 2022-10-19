package dk.proxy.pattern.yesInterface;

public class YIClient {
    public  void run(){
        YIGamePlayProxy proxyObject = new YIGamePlayProxy(new YIGamePlayImpl());
        proxyObject.playGame();
    }
}
