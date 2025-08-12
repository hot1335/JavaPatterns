package biz.baijing.bridge;

/**
 * 桥接模式 - 实现化角色 : mp3 文件格式
 * @version 0.1
 * @author  BaiJing.biz
 */
public class Mp3Format implements MusicFormat {

    @Override
    public void decode(String musicFilename) {
        System.out.println("MP3 音频格式文件 - " + musicFilename);
    }
}
