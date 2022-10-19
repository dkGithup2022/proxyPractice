package dk.proxy.pattern.noInterface;

public class NIGamePlayProxy extends NIGamePlay {
    NIGamePlay niGamePlay = new NIGamePlay();

    @Override
    public void playGame() {
        Long before = System.currentTimeMillis();
        niGamePlay.playGame();
        System.out.println("took : " + (System.currentTimeMillis() - before));
    }
}
