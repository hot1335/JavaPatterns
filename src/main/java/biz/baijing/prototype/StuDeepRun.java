package biz.baijing.prototype;

/**
 * 原型模式 - 深克隆 deep copy
 * @version 0.1
 * @author  BaiJing.biz
 */
public class StuDeepRun {
    public static void main(String[] args) throws CloneNotSupportedException {

        DiplomaDeep diploma = new DiplomaDeep();

        Student student = new Student();
        student.setName("Tom 汤姆");

        diploma.setStudent(student);

        Diploma clone = diploma.clone();
        diploma.getStudent().setName("John");

        diploma.show();

        clone.show();

    }
}
