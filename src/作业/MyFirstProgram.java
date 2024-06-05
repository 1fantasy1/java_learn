package mypack;

public class MyFirstProgram {
    private String myName="刘涛";
    public void display()
    {
        System.out.println(myName);
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MyFirstProgram myFirstProgram1;//声明引用变量
        myFirstProgram1= new MyFirstProgram();//创建对象实例
        myFirstProgram1.display();
    }
}