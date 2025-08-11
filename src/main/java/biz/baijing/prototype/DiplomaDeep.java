package biz.baijing.prototype;

import java.io.Serializable;

/**
 * 原型模式 - 深克隆 deep copy
 * @version 0.1
 * @author  BaiJing.biz
 */
public class DiplomaDeep implements Cloneable , Serializable {

    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public Diploma clone() throws CloneNotSupportedException {
        return (Diploma) super.clone();
    }

    public void show() {
        System.out.println(student.getName() + " 于2025年毕业于 BaiJing Tech University !");
    }

}
