import java.util.Scanner;

import static java.lang.System.in;

public class Collor4 {
    public static final String TEXT_RESET = "\u001B[0m";
    public static final String TEXT_RED = "\u001B[31m";
    public static final String TEXT_GREEN = "\u001B[32m";
    public static final String TEXT_YELLOW = "\u001B[33m";
    public static void main(String[] args) {
        System.out.print(Collor4.printCollor());
    }


    public static int printCollor(){

        Scanner sc = new Scanner(in);
        int value;
        value=sc.nextInt();
         if  (value<=0){
            System.out.println(TEXT_RED+"ЧЕРВОНИЙ"+TEXT_RESET);
        }else if (value>0&&value<=100) {
            System.out.println(TEXT_YELLOW+"ЖОВТИЙ"+TEXT_RESET);
        }else if (value>100) {
             System.out.println(TEXT_GREEN+"ЗЕЛЕНИЙ"+TEXT_RESET);
         }


        return value;
    }
}
   // Створіть метод printColor() у тілі якого задайте int змінну value та ініціалізуйте її
//будь-яким значенням. Якщо значення менше 0 (0 включно), то в консоль метод повинен
    //    вивести повідомлення "Червоний", якщо лежить в межах від 0 (0 виключно)
      //  до 100 (100 включно), то "Жовтий", якщо більше 100 (100 виключно) - "Зелений";