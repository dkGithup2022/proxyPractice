package dk.proxy.pattern.noInterface;


public class NIGamePlay {
    public void playGame() {
        try {
            Thread.sleep(1000);
            System.out.println("Play some game ~");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
