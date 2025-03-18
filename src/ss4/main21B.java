package ss4;


import java.util.Scanner;

public class main21B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một số nguyên dương n :");
        int n = scanner.nextInt();

        boolean isPrime = true;

        if (n < 2){
            isPrime = false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }

        }
        if (isPrime) {
            System.out.printf("%d là số nguyên tố ", n);
        } else {
            System.out.printf("%d không phải là số nguyên tố ", n);
        }
    }
}