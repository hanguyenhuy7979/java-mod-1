package ss4;

import java.util.Scanner;

public class main10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println(" Nhập vào số nguyên dương n:");
        int n = scanner.nextInt();

        double sum = 0.0;


        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;

        }
        System.out.println("Tổng S " + sum);
    }
}
