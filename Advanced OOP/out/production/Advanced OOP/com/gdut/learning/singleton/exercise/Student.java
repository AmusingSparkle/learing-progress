package com.gdut.learning.singleton.exercise;

/**
 * @author Sparkle
 * @version 1.0
 */
public class Student {
    private String name;
    private String number;
    private static int tail=000;
    private static int totalStudents;
    private static  String school;
    static {
        school="未来小学";
    }
    {
        tail++;
        Student.totalStudents++;
        number="XW2025"+String.format("%03d",tail);
    }

    public Student(String name) {
        this.name = name;
    }

     public static String getSchoolInfo(){
        return "学校名:" + Student.school+"\t学生人数" + Student.totalStudents;
    }

    public String  getStudentInfo(){
        return "学生名"+name+"\t\t\t学号"+number;
    }
}
