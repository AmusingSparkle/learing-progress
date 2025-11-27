package com.gdut.learning.singleton.exercise;

import com.gdut.learning.finalexercise.S;

/**
 * @author Sparkle
 * @version 1.0
 * 设计一个Student类，要求包含以下元素：
 * 静态变量 totalStudents：记录已创建的学生对象总数。
 * 静态变量 schoolName：存储学校名称（初始值为空）。
 * 静态代码块：初始化学校名称为"未来小学"，并打印提示信息。
 * 实例代码块：每创建一个学生对象时自动生成学号（格式：FH2024001、FH2024002...），并更新学生总数。
 * 静态方法 getSchoolInfo()：返回学校信息（包含学校名称和学生总数）。
 * 普通方法 getStudentInfo()：返回学生个人信息（学号、姓名）。
 * 在main方法中验证所有功能。
 */
public class Main {
    public static void main(String[] args) {
        Student ben = new Student("Ben");
        Student jack = new Student("Jack");
        Student smith = new Student("Smith");
        Student wait = new Student("Wait");
        Student liHua = new Student("LiHua");
        Student jiaMing = new Student("JiaMing");
        System.out.println(ben.getStudentInfo());
        System.out.println(jack.getStudentInfo());;
        System.out.println(smith.getStudentInfo());
        System.out.println(wait.getStudentInfo());
        System.out.println(liHua.getStudentInfo());
        System.out.println( jiaMing.getStudentInfo());
        System.out.println(Student.getSchoolInfo());;
    }
}
