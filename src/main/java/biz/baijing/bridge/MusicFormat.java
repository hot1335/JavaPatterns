package biz.baijing.bridge;

/**
 * 桥接模式 - 实现化角色
 * @version 0.1
 * @author  BaiJing.biz
 */
public interface MusicFormat {

    // 不同格式的解码
    void decode(String musicFilename);
}
