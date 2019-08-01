package homeWork_2;

public class Execution {

    double a, b, c;

    public Execution(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void calculating() {
        if (a != 0) {
            double discriminant = calculatingDiscriminant();
            if (hasNoNegativeDescriminant(discriminant)) {
                double x1 = getRoot((-1) * calculatingSqrtDiscriminant(discriminant));
                double x2 = getRoot(calculatingSqrtDiscriminant(discriminant));
                Decision.printDicision(x1, x2);
            } else {
                System.out.println("No solution!");
            }
        } else {
            System.out.println("This equation isn`t quadratic!");
        }
    }

    public double calculatingDiscriminant() {
        return b * b - 4 * a * c;
    }

    public boolean hasNoNegativeDescriminant(double discriminant) {
        return discriminant >= 0;
    }

    public double getRoot(double sqrtDiscriminant) {
        return (-b + sqrtDiscriminant) / (2 * a);
    }

    public double calculatingSqrtDiscriminant(double discriminant) {
        return Math.sqrt(discriminant);
    }
}
