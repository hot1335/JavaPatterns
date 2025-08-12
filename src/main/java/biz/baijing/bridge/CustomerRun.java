package biz.baijing.bridge;

public class CustomerRun {
    public static void main(String[] args) {
        // 创建 Apple 对象
        ApplePlayDev applePlayDev = new ApplePlayDev(new Mp3Format());
        applePlayDev.play("周杰伦 - 青花瓷");

        WindowsPlayDev windowsPlayDev = new WindowsPlayDev(new Mp4Format());
        windowsPlayDev.play("花前月下 - 一双人");
    }
}
