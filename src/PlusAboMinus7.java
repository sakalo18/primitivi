public class PlusAboMinus7 {
    static float x = -5;
    static float a = 7;
    static float b = 4;
    static float s = -3;

    public static void main(String[] args) {
        System.out.print(PlusAboMinus7.PlusAboMinus());

    }

    public static double PlusAboMinus() {

        System.out.println("від’ємне(" + x + ")=" + Math.signum(x));

        System.out.println("додатнє(" + a + ")=" + Math.signum(a));

        System.out.println("додатнє(" + b + ")=" + Math.signum(b));

        System.out.println("від’ємне(" + s + ")=" + Math.signum(s));
        return 0;
    }

}


//  Написати метод, якому як параметр передається ціле число, метод повинен надрукувати в консоль,
//    чи додатнє число передали
//  або від’ємне. Примітка: нуль вважаємо позитивним числом.