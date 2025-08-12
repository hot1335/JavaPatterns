package biz.baijing.bridge;

/**
 * 桥接模式 - 实现化角色 : mp4 文件格式
 * @version 0.1
 * @author  BaiJing.biz
 */
public class Mp4Format implements MusicFormat {

    @Override
    public void decode(String musicFilename) {
        System.out.println("MP4 音频格式文件 - " + musicFilename);
    }
}
