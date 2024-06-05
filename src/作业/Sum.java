package mypack;

public class Sum {
    static final int ARRSIZE=100;
    static int intArr[]=new int[ARRSIZE];
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        for(int i=0;i<intArr.length;i++)
            intArr[i]=i+1;
        int result=0;
        for(int i=0;i<intArr.length;i++)
            result+=intArr[i];
        System.out.println("sum="+result);
    }

}