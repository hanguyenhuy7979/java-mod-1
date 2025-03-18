package ss7_String;

import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        // bc 1 nhập vào số lượng phần tử của mảng
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Nhập vào số lượng phần tử của mảng :");
            n = scanner.nextInt();

            if (n < 0) {
                System.out.println("Số lượng phần tử của mảng phải >= 0 . Xin kiểm tra lại :");
            }
        } while (n < 0);
        //bc 2 tạo ra mảng có n phần tử
        int[] arr = new int[n];
        //bc 3 nhập mảng
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập vào phần tử arr[%d]:", i);
            arr[i] = scanner.nextInt();
        }
        //bc 4 xuất mảng
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    static void inputArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhập vào phần tử arr[%d]: ", i);
            //arr[i] = scanner.nextInt();
        }

        int[] a = {2, 3, 4, 5};
        boolean isAllEven = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) ;
            System.out.println("Mảng không toàn chẵn !");
            isAllEven = false;
            break;
        }

        if (isAllEven) {

            System.out.println("Mảng toàn chẵn");
        }

    }

}



