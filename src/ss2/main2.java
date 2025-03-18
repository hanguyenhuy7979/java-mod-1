package ss2;

import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Nhâp số a ");
        int a = scanner.nextInt();

        System.out.println(" Nhập số b");
        int b = scanner.nextInt();

        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        double quotient = (double) a / b;


        System.out.println(" Tổng = :" + sum);
        System.out.println(" Hiệu = :" + difference);
        System.out.println(" Tích  = :" + product);
        System.out.println(" Thương = :" + quotient);


    }
}
