import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        while (true) {
            System.out.print("Nhap kich thuoc cua mang: ");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n > 0) {
                    break;
                }
            }
            System.out.println("Kich thuoc khong hop le. Vui long nhap so nguyen duong.");
        }

        int[] arr = new int[n];
        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            while (!scanner.hasNextInt()) {
                System.out.println("Vui long nhap so nguyen hop le.");
                scanner.next();
            }
            arr[i] = scanner.nextInt();
        }

        System.out.print("arr[] = [");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        int sum = 0;
        boolean divisibleBy3 = false;
        for (int num : arr) {
            if (num % 3 == 0) {
                sum += num;
                divisibleBy3 = true;
            }
        }

        if (divisibleBy3) {
            System.out.println("Tong = " + sum);
        } else {
            System.out.println("\"Khong co so chia het cho 3\"");
        }
    }
}
