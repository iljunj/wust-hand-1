//JAVA基本程序设计
import java.util.Scanner;
public class FirstSample {
    public static void main(String[] args) {
      String greeting="Hello";//不可变字符串
      String s=greeting.substring(0,3);//取子串
        System.out.println(greeting+s);//拼接
        if(greeting.equals("Hello")){//equal方法判断字符串是否相等
            int num=greeting.length();//length方法得到字符串的长度
            char first=greeting.charAt(0);//charAt返回位置为n的码点单元
            System.out.println(num);
            System.out.println(first);
        }
      Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        int age=in.nextInt();
        System.out.println(str+age);
        int []a=new int[10];
        for (int i = 0; i < 10; i++) {
            a[i]=i;
        }
        for(int element:a){
            System.out.println(element);
        }
    }
}
