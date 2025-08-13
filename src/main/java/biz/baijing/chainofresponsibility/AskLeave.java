package biz.baijing.chainofresponsibility;

/**
 * 责任链模式 - 具体处理事物类
 * @version 0.1
 * @author  BaiJing.biz
 */
public class AskLeave {

    private String name;
    private int days;
    private String content;

    public AskLeave(String name, int days, String content) {
        this.name = name;
        this.days = days;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
