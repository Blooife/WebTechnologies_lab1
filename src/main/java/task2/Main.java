package task2;

import java.util.Scanner;

public class Main {
    public static boolean checkFigure(int x, int y){
        return checkBottomOfFigure(x, y) || checkTopOfFigure(x, y);
    }

    public static boolean checkBottomOfFigure(int x, int y){
        return (x >= -6 && x <= 6) && ( y>= -3 && y <= 0);
    }

    public static boolean checkTopOfFigure(int x, int y){
        return (x >= -4 && x <=4 ) && (y >= 0 && y <= 5);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(checkFigure(x,y));
    }
}
