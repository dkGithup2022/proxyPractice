package dk.proxy.pattern.yesInterface;

public class YIGamePlayImpl implements YIGamePlay{
    @Override
    public void playGame() {
        try {
            Thread.sleep(1000);
            System.out.println("YIGamePlayImpl : play game");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
