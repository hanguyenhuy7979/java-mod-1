package ss2;

import java.util.Scanner;

public class main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào bán kinh r: ");
        double r = scanner.nextDouble();

        double c = 2 * Math.PI * r; //Math.PI = 3,141592


        double a = Math.PI * Math.pow(r, 2);

        System.out.println(" Chu vi C = " + c);
        System.out.println("Diện tích A = " + a);
    }
}
