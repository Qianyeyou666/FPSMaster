package top.fpsmaster.interfaces.sound;

public interface ISoundWrapper {
    void playLightning(double posX, double posY, double posZ, float i, float v, boolean b);
    void playExplosion(double posX, double posY, double posZ, float i, float v, boolean b);
    void playRedStoneBreak(double posX, double posY, double posZ, float i, float v, boolean b);
}
