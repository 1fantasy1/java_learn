package mypack;
//import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int year =2005;
        //	Scanner sc=new Scanner(System.in);
        //	int year=sc.nextInt();
        boolean yearDiv4=(year%4==0);
        boolean yearNotDiv100=(year%100!=0);
        boolean yearDiv400=(year%400==0);
        Boolean isLeap=(yearDiv4&&yearNotDiv100)||yearDiv400;
        String disLeap=isLeap? "是闰年":"不是闰年";
        System.out.println(year+"年"+disLeap);
    }
}