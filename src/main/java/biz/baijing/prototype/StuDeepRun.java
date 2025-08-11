package biz.baijing.prototype;

import java.io.*;

/**
 * 原型模式 - 深克隆 deep copy
 * @version 0.1
 * @author  BaiJing.biz
 */
public class StuDeepRun {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {

        DiplomaDeep diploma = new DiplomaDeep();

        Student student = new Student();
        student.setName("Tom 汤姆");

        diploma.setStudent(student);

        diploma.show();

        // 深克隆
        ObjectOutputStream oos  = new ObjectOutputStream(new FileOutputStream("/Users/tree/javasrc/testfile/a.txt"));
        oos.writeObject(diploma);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/tree/javasrc/testfile/a.txt"));
        DiplomaDeep clone = (DiplomaDeep)ois.readObject();
        ois.close();

        clone.getStudent().setName("John");

        clone.show();
    }
}
