package biz.baijing.memento.white;

public class CustomerRun {
    public static void main(String[] args) {

        // 创建角色并初始化
        GameRole gameRole = new GameRole();
        gameRole.initRole();

        System.out.println("======== 初始值 ========");
        gameRole.parameterShow();

        // 备份数据
        RoleMementoCaretaker roleMementoCaretaker = new RoleMementoCaretaker();
        roleMementoCaretaker.setRoleParameterMemento(gameRole.saveParameter());

        System.out.println("======== 大战 ========");

        gameRole.fighting();
        gameRole.parameterShow();

        System.out.println("======== 回血 ========");

        // 通过备忘录恢复
        gameRole.recoverParameter(roleMementoCaretaker.getRoleParameterMemento());
        gameRole.parameterShow();


    }
}
