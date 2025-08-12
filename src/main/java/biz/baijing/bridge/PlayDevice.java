package biz.baijing.bridge;

/**
 * 桥接模式 - 抽象化角色 ：播放设备
 * @version 0.1
 * @author  BaiJing.biz
 */
public abstract class PlayDevice {

    // 声明 music file
    protected  MusicFormat musicFormat;

    public PlayDevice(MusicFormat musicFormat) {
        this.musicFormat = musicFormat;
    }

    public abstract void play(String musicFilename);
}
