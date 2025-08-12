package biz.baijing.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合模式 - 树枝节点 ： 组织结构
 * @version 0.1
 * @author  BaiJing.biz
 */
public class Organize extends Department {

    // 部门是多个部门
    private List<Department> departments = new ArrayList<Department>();

    public Organize(String name , int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(Department department) {
        departments.add(department);
    }

    @Override
    public void remove(Department department) {
        departments.remove(department);
    }

    @Override
    public Department getLevel(int index) {
        return departments.get(index);
    }


}
