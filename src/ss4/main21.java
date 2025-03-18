package ss4;

import java.util.Scanner;

public class main21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Nhập một số nguyên dương n:");
        int n = scanner.nextInt();

        String str = Integer.toString(n);
        boolean isPalindrome = true;
        for (int i = 1; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.printf("%d là số đối xứng ", n);
        } else {
            System.out.printf("%d không phải là số đối xứng ", n);
        }
    }
}
