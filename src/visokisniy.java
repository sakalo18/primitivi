import java.util.Scanner;

import static java.lang.System.in;

public class visokisniy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        boolean b = true;
        boolean c = false;
        System.out.print("ВВЕДИТЕ ГОД");
        int a = sc.nextInt();
        if (a % 100 == 0 && a % 400 == 0 && a % 4 == 0 && a % 100 != 0)
            System.out.print(b);
        else
            System.out.print(c);


        }

    }


