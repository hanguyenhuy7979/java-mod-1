import java.util.Scanner;

public class ScannerInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Nhập vào tên của bạn: ");
 //       scanner.nextLine();
        String name = scanner.nextLine();

        System.out.println("Nhập vào điểm ");
 //       double score = scanner.nextDouble();
        double  score = Double.parseDouble(scanner.nextLine());
 //       Integer.parseInt(scanner.nextLine());


        System.out.print("Tên của bạn là : " + name );
        System.out.print("Điểm  của bạn là : " +score );






    }
}
