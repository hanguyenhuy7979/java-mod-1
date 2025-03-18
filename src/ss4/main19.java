package ss4;

import java.util.Scanner;

public class main19 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);


        System.out.println("Nhập một số nguyên dương n :");
        int n = scanner.nextInt();

        String binary = "";
        while (n > 0){
            int remainder = n % 2;
            binary = remainder + binary;
            n = n / 2;
        }
        System.out.println("Số Nhị phan tương ứng là : " +binary);
    }
}
