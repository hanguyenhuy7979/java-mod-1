package ss3;

import java.util.Scanner;

public class main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Nhập số thứ nhất (a); ");
        int a = scanner.nextInt();

        System.out.println(" Nhập số thứ nhất (b); ");
        int b = scanner.nextInt();

        int max, min;

        if (a > b) {
            max = a;
            min = b;

        } else {
            max = b;
            min = a;

        }
        System.out.println("Số lớn nhất là : " + max);
        System.out.println("Số nhỏ nhất là : " + min);
    }

}
