package biz.baijing.bridge;

/**
 * 桥接模式 - 扩展实现化角色
 * @version 0.1
 * @author  BaiJing.biz
 */
public class WindowsPlayDev extends PlayDevice {
    public WindowsPlayDev(MusicFormat musicFormat) {
        super(musicFormat);
    }

    @Override
    public void play(String musicFilename) {
        musicFormat.decode(musicFilename);
    }
}
