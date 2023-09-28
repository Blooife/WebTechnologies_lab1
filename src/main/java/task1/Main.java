package task1;

import java.util.Scanner;

public class Main {
    public static double calculate(double x, double y) {
        double numerator = 1 + Math.sin(x + y) * Math.sin(x + y);
        return numerator / (2 + Math.abs(x - 2 * x / (1 + x * x * y * y))) + x;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        System.out.println(calculate(x,y));
    }
}
