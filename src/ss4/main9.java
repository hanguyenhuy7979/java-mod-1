package ss4;

import java.util.Scanner;

public class main9 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Nhập vào số nguyên n:");
        int n = scanner.nextInt();

        int a =1;
        int b=1;
        while ( a <= n){
            System.out.println(a * b + " ");
            a = a * 2 + 1;
            b = -b;
        }
    }
}
