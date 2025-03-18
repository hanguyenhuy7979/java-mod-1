package ss3;

import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số thứ nhất (a): ");
        int a =     scanner.nextInt();

        System.out.println("Nhập số thứ hai (b): ");
        int b = scanner.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Sau khi đảo giá  trị:");
        System.out.println("a ="+ a);
        System.out.println("b ="+ b);
    }
}
