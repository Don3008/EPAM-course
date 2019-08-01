package homeWork_2;

public class Decision {

    public static void printDicision(double x1, double x2) {
        if (x1 == x2) {
            System.out.println("Equation`s roots are equal to each other: " + x1);
        } else {
            System.out.println("Root \"x1\" = " + x1);
            System.out.println("Root \"x2\" = " + x2);
        }
    }
}
