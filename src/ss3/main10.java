package ss3;

import java.util.Scanner;

public class main10 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Nhập một số nguyên dương x :");
        int x =scanner.nextInt();

        double squareRoot = Math.sqrt(x);

        if (squareRoot % 1 == 0){
            System.out.println(x + " Là số chính phương . ");

        }else{
            System.out.println(x +" Không phải là số chính phương. " );
        }
    }
}
