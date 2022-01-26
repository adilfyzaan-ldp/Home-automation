package com.company;


interface Machinelearning{
    void mltutorial();
}
interface Webdevelopment{
    void webtutorial();
}
class Student1 implements Machinelearning{
    public void mltutorial(){
        System.out.println("this is machine learning module");
    }
}
class Student2 implements Webdevelopment{
    public void webtutorial(){
        System.out.println("this is web development module");
    }
}
class Student3 implements Machinelearning,Webdevelopment{
     public void mltutorial() {
         System.out.println("this is machine learning module");
     }
     public void webtutorial(){
         System.out.println("this is web development module");
     }



}



public class Interfaces {

    public static void main(String[] args) {
	// write your code here
        Student3 stu = new Student3();
        stu.mltutorial();
        stu.webtutorial();

    }
}
