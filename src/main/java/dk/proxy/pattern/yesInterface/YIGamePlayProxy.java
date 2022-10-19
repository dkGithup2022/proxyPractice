package dk.proxy.pattern.yesInterface;

public class YIGamePlayProxy implements YIGamePlay{
    YIGamePlay impl;

    public YIGamePlayProxy(YIGamePlay impl){
        this.impl =impl;
    }
    @Override
    public void playGame() {
        Long before = System.currentTimeMillis();
        impl.playGame();
        System.out.println("took : " + (System.currentTimeMillis()-before));
    }

/*
// 초기화 지연
    public void playGame2() {
        if(this.impl == null){
            this.impl = new YIGamePlayImpl();
        }
        Long before = System.currentTimeMillis();
        impl.playGame();
        System.out.println("took : " + (System.currentTimeMillis()-before));
    }

 */
}
