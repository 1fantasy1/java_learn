package mypack;

import java.util.Scanner;

public class GradeLevel {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String level;
        int grade;
        boolean gradeBe0_59;
        boolean gradeBe60_70;
        boolean gradeBe70_80;
        boolean gradeBe80_90;
        boolean gradeBe90_100;

        Scanner sc=new Scanner(System.in);
        grade=sc.nextInt();

        gradeBe0_59=(grade>=0)&&(grade<60);
        gradeBe60_70=(grade>=60)&&(grade<70);
        gradeBe70_80=(grade>=70)&&(grade<80);
        gradeBe80_90=(grade>=80)&&(grade<90);
        gradeBe90_100=(grade>=90)&&(grade<=100);

        level=(gradeBe0_59)? "不及格":"";
        level=(gradeBe60_70)? "及格":level;
        level=(gradeBe70_80)? "中等":level;
        level=(gradeBe80_90)? "Good":level;
        level=(gradeBe90_100)? "Excellent":level;

        System.out.println("Your grade level is "+level);
    }
}