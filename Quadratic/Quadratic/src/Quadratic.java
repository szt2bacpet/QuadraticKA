public class Quadratic {
    public static void main(String[] args) {
        solveQuadraticEquation(1, -3, 2);
    }

    public static void solveQuadraticEquation(double a, double b, double c) {
        if (a == 0) {
            System.out.println("Ez nem egy másodfokú egyenlet.");
            return;
        }

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Két zérushely van:");
            System.out.println("Zérushely 1: " + root1);
            System.out.println("Zérushely 2: " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Egy zérushely van:");
            System.out.println("Zérushely: " + root);
        } else {
            System.out.println("Nincs valós zérushely.");
        }
    }
}
