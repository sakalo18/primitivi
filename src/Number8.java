import java.util.Scanner;

import static java.lang.System.in;

public class Number8 {

    public static void main(String[] args) {
        boolean b=true;
        boolean c=false;
        Scanner sc = new Scanner(in);
        float a=sc.nextFloat();
        if(a>=0)
            System.out.println(b);
            else if (a<0) {
                System.out.print(c);
            }

        }
    }
//Написати метод, якому як параметр передається ціле число. Метод повинен повернути true,
   //     якщо число є негативним, і повернути false якщо позитивне.