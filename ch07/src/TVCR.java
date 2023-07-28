class Tv2 {
    boolean power;
    int channel;

    void power() { power = !power; }
    void channelUp() { ++channel; }
    void channelDown() { --channel; }
}

class VCR {
    boolean power;
    int counter = 0;
    void power() { power = !power; }
    void play() { /* skip content*/ }
    void stop() { /* skip content*/ }
    void rew() { /* skip content*/ }
    void ff() { /* skip content*/ }
}
public class TVCR extends Tv2 {
    VCR vcr = new VCR();  // 포함
    int counter = vcr.counter;

    void play() {
        vcr.play();
    }
    void stop() {
        vcr.stop();
    }
    void rew() {
        vcr.rew();
    }
    void ff() {
        vcr.ff();
    }
}
