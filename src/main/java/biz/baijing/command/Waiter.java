package biz.baijing.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 命令模式 - 调用者：服务员
 * @version 0.1
 * @author  BaiJing.biz
 */
public class Waiter {

    // 命令对象
    private List<Command> commands = new ArrayList<Command>();

    // 设置命令到 List
    public void setCommand(Command command){
        commands.add(command);
    }

    // 发起
    public void sayOrder() {
        System.out.println("服务员 Say： 新订单来了 ！");

        for (Command command : commands) {
            if (command !=  null) {
                command.doDishes();
            }
        }
    }

}
