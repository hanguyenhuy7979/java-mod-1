package ss4;

import java.util.Scanner;

public class main13 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Nhập số nguyên dương a:");
        int a = scanner.nextInt();
        System.out.println("Nhập số nguyên dương b:");
        int b = scanner.nextInt();

        int uscln = 2;
        for (int i =a ; i >= 1; i--){
            if (a % i == 0 && b % i== 0){
                uscln = i;
                break;
            }
        }
        int bscnn;
        for (int i = a; true; i++){
            if (i % a == 0 && i % b== 0){
                bscnn = i;
                break;
            }
        }
        System.out.println("Ước số chung lớn nhất của "+ a + " và "+ b +" là "+ uscln);
        System.out.println("Ước số chung nhỏ nhất của "+ a + " và "+ b +" là "+ uscln);
    }
}
