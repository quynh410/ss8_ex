import java.util.Scanner;

public class Bai1 {
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
            scanner.nextLine();
        }

        int[] arr = new int[n];
        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            System.out.print("Arr [" + (i + 1) + "] = ");
            while (!scanner.hasNextInt()) {
                System.out.println("Vui long nhap so nguyen hop le.");
                scanner.next();
            }
            arr[i] = scanner.nextInt();
        }

        int minVal = arr[0], maxVal = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
            if (arr[i] < minVal) {
                minVal = arr[i];
            }
        }

        System.out.println("Gia tri lon nhat: " + maxVal);
        System.out.println("Gia tri nho nhat: " + minVal);
    }
}
