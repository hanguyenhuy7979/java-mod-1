package ss2;

import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập năm sinh của bạn : ");
        int year0Birth = scanner.nextInt();

        int age = 2025 - year0Birth;

        System.out.println(" Tuổi của ban là : " + age);
    }
}
