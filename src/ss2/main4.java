package ss2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class main4 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Nhập vào điểm Toán: ");
        double diemToan = scanner.nextDouble();

        System.out.println("Nhập vào hệ số Toán: ");
        double hsToan = scanner.nextDouble();

        System.out.println("Nhập vào điểm Lý: ");
        double diemLy = scanner.nextDouble();

        System.out.println("Nhập vào hệ số Lý : ");
        double hsLy = scanner.nextDouble();

        System.out.println("Nhập vào điểm Hóa: ");
        double diemHoa = scanner.nextDouble();

        System.out.println("Nhập vào hệ số Hóa: ");
        double hsHoa = scanner.nextDouble();


        double diemTB = (diemToan + hsToan + diemLy + hsLy + diemHoa + hsHoa) / (hsToan + hsLy + hsHoa);

        System.out.println("Điểm TB : "+ diemTB);

    }
}
