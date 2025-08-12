package biz.baijing.composite;

/**
 * 组合模式 - 组件(抽象根节点)： 部门的公共操作
 * @version 0.1
 * @author  BaiJing.biz
 */
public abstract class Department {

    // 部门名称
    protected String name;
    // 部门层级
    protected int level;

    public void add(Department department) {
        System.out.println("添加部门成功 " + department);
    }

    public void remove(Department department) {
        System.out.println("移除部门成功" + department);
    }

    public Department getLevel(int index) {
        System.out.println("部门的所属部门 " + index);
        return null;
    }

    public String getName() {
        return name;
    }



}
