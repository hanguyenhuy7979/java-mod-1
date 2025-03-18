package ss6_method;

import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        int n = 100;
        boolean isPrime = isPrime(n);
        if (isPrime) {
            System.out.println(" n là số nguyên tố ");
        } else {
            System.out.println(" n không phải là số nguyên tố ");
        }
        int totalPrime = calTotalPrime(n);
        System.out.println(totalPrime);
        char a = 'B';
        char c = tolowerCase(a);
        System.out.println("tolowerCase: " + c);


    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;


        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;


    }

    public static int calTotalPrime(int n) {
        int total = 0;
        while (n != 0) {
            if (isPrime(n % 10)) {
                total += n % 10;
            }
            n /= 10;
        }
        return total;
    }

    public static char tolowerCase(char c) {
        if (c >= 'A' && c <= 'Z') {
            c += 32;
        }
        return c;
    }

    public static void levelone(double a, double b) {
        // ax + b = 0
        if (a == 0) {
            if (b == 0) {
                System.out.println(" phương trình vô số nghiệm");
            } else {
                System.out.println("phương trình vô nghiệm");
            }
        } else {
            double x = -b / a;
            System.out.println("Nghiệm  của phương trình là x = " + x);
        }

    }

    public static void leveltwo(double a, double b, double c) {
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println(" phương trình vô số nghiệm");
                } else {
                    System.out.println("phương trình vô nghiệm");
                }
            } else {
                double x = -c / b;
                System.out.println("Nghiệm  của phương trình là x = " + x);
            }
        } else{
            double delta = b * b - 4 * a * c ;
        }
    }
}


