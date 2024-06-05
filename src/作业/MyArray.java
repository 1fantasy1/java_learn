package mypack;

public class MyArray {
    public static void main(String[] args) {
        int[] myArray=new int[10];
        myArray[0]=0;
        myArray[1]=1;
        myArray[2]=2;
        myArray[9]=9;
        System.out.println("Index\t\tValue");
        for (int i=0;i<myArray.length; i++) {
            System.out.println(i + "\t\t" +myArray[i]);
        }
        System.out.print("Values:");
        for (int i :myArray) {
            System.out.print(i + " ");
        }
        System.out.print("\n");
//        myArray[10]=100;
    }
}
