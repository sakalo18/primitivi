import java.util.Scanner;

import static java.lang.System.in;

public class CheckSumSign3 {

    public static int CheckSumSign() {
        Scanner sc = new Scanner(in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        a = a + b;
        if (a > 0 && a == 0) {
            System.out.println(a + "Сума негативна");
        } else {
            System.out.println(a + "Сума  позитивна ");

        }return a;

    }
    public static void main(String[] args) {

        System.out.print(CheckSumSign3.CheckSumSign());
    }

    }