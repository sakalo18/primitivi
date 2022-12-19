import java.util.Scanner;

import static java.lang.System.in;

public class Vid10DO20numb6 {
    public static void main(String[] args) {
System.out.print(vid10());
    }
    public static int vid10(){
        Scanner sc = new Scanner(in);
int a1= sc.nextInt();
int b1= sc.nextInt();

        boolean a= true;
        boolean b=false;
        if(a1>=10&&a1<=20)
         System.out.print(a+"\n");
        else
            System.out.print(b+"\n");

        if(b1>=10&&b1<=20)
        System.out.print(a+"\n");
        else
        System.out.print(b+"\n");


        return vid10();
    }
}
