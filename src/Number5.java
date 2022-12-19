import java.util.Scanner;

import static java.lang.System.in;

public class Number5 {
    public static void main(String[] args) {
        System.out.print(Number5.compareNumbers());
    }
public static int compareNumbers(){
    Scanner sc = new Scanner(in);
    int a= sc.nextInt();
    int b=sc.nextInt();
    if(a>=b){
        System.out.println("a >= b");
    }else
        System.out.println("a < b");





    return compareNumbers();
}


   // Створіть метод compareNumbers(), у тілі якого оголосіть дві int змінні a і b, та ініціалізуйте
    //їх будь-якими значеннями, якими захочете. Якщо a більше або одно b,
    //необхідно вивести в консоль повідомлення “a >= b”, інакше “a < b”;
}
