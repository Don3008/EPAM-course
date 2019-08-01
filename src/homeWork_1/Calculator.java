package homeWork_1;

public class Calculator {

    public static void main(String[] args) {
        calculate(1, 4, 3);
    }

    public static void calculate(int a, int b, int c) {
        double x1, x2;
        double discr = b * b - 4 * a * c;
        double sqrtDiscr = Math.sqrt(discr);
        if (discr > 0) {
            x1 = (-b + sqrtDiscr) / 2 * a;
            x2 = (-b - sqrtDiscr) / 2 * a;
            System.out.println("x1 = " + x1 + "\n" + "x2 = " + x2);
        } else if (discr == 0) {
            x1 = -b / 2 * a;
            System.out.println("x = " + x1);
        } else {
            System.out.println("Дискриминант меньше нуля!");
        }
    }
}
