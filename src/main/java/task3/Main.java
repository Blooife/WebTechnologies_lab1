package task3;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static class Element{
        double tan;
        double arg;

        Element(double t, double a){
            tan = t;
            arg = a;
        }

        @Override
        public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Element e = (Element) o;
            if (!Objects.equals(tan, e.tan)) return false;
            return Objects.equals(arg, e.arg);
        }
    }

    public static ArrayList<Element> calculateTanWithStep(double a, double b, double h){
        ArrayList<Element> result = new ArrayList<>();
        for (double x = a; x <= b; x+=h ){
            result.add(new Element(Math.tan(x), x));
        }
        return result;
    }

    public static void printTable(ArrayList<Element> listOfElements){
        for (Element el: listOfElements) {
            System.out.format("%.2f %.2f\n", el.arg, el.tan);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double h = scanner.nextDouble();
        printTable(calculateTanWithStep(a,b,h));
    }
}
