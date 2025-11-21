package com.gdut.homework.homework01;

public class Homework01Main {
    public static void main(String[] args) {
        Person p1 = new Person("Ben", 16, "student");
        Person p2 = new Person("Marka", 28, "soldior");
        Person p3 = new Person("Hens", 6, "pupil");
        Person[] arr= {p1,p2,p3};

        Person temp=null;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j< arr.length-i-1;j++){
                if(arr[j].getAge()< arr[j+1].getAge()){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
