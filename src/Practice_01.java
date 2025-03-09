import java.util.Arrays;
import java.util.Scanner;

public class Practice_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[100]; // Mảng có tối đa 100 phần tử
        int n = 0; // Số lượng phần tử thực tế trong mảng

        while (true) {
            System.out.println("********************** MENU **********************");
            System.out.println("1. Nhap gia tri n phan tu cua mang");
            System.out.println("2. In gia tri cac phan tu trong mang");
            System.out.println("3. Tinh trung binh cac phan tu duong");
            System.out.println("4. Tim vi tri cac phan tu bang k");
            System.out.println("5. Sap xep giam dan (Bubble Sort)");
            System.out.println("6. Dem so luong so nguyen to");
            System.out.println("7. Sap xep theo quy tac dac biet");
            System.out.println("8. Chen m vao mang giam dan");
            System.out.println("9. Thoat");
            System.out.print("Chon chuc nang: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhap so luong phan tu n: ");
                    n = scanner.nextInt();
                    System.out.println("Nhap cac phan tu:");
                    for (int i = 0; i < n; i++) {
                        System.out.print("arr[" + i + "] = ");
                        arr[i] = scanner.nextInt();
                    }
                    break;

                case 2:
                    if (n == 0) {
                        System.out.println("Mang chua co du lieu!");
                    } else {
                        System.out.print("Mang hien tai: ");
                        for (int i = 0; i < n; i++) {
                            System.out.print(arr[i] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    double sum = 0;
                    int count = 0;
                    for (int i = 0; i < n; i++) {
                        if (arr[i] > 0) {
                            sum += arr[i];
                            count++;
                        }
                    }
                    if (count == 0) {
                        System.out.println("Khong co so duong!");
                    } else {
                        System.out.println("Trung binh cong cac so duong: " + (sum / count));
                    }
                    break;

                case 4:
                    System.out.print("Nhap gia tri k: ");
                    int k = scanner.nextInt();
                    boolean found = false;
                    System.out.print("Vi tri cua " + k + ": ");
                    for (int i = 0; i < n; i++) {
                        if (arr[i] == k) {
                            System.out.print(i + " ");
                            found = true;
                        }
                    }
                    if (!found) System.out.println("Khong tim thay!");
                    else System.out.println();
                    break;

                case 5:
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = 0; j < n - i - 1; j++) {
                            if (arr[j] < arr[j + 1]) {
                                int temp = arr[j];
                                arr[j] = arr[j + 1];
                                arr[j + 1] = temp;
                            }
                        }
                    }
                    System.out.println("Mang da sap xep giam dan.");
                    break;

                case 6:
                    int primeCount = 0;
                    for (int i = 0; i < n; i++) {
                        if (arr[i] > 1) {
                            boolean isPrime = true;
                            for (int j = 2; j * j <= arr[i]; j++) {
                                if (arr[i] % j == 0) {
                                    isPrime = false;
                                    break;
                                }
                            }
                            if (isPrime) primeCount++;
                        }
                    }
                    System.out.println("So luong so nguyen to: " + primeCount);
                    break;

                case 7:
                    int[] div3Even = new int[n];
                    int[] div3Odd = new int[n];
                    int[] others = new int[n];
                    int evenCount = 0, oddCount = 0, otherCount = 0;
                    for (int i = 0; i < n; i++) {
                        if (arr[i] % 3 == 0) {
                            if (arr[i] % 2 == 0) {
                                div3Even[evenCount++] = arr[i];
                            } else {
                                div3Odd[oddCount++] = arr[i];
                            }
                        } else {
                            others[otherCount++] = arr[i];
                        }
                    }
                    Arrays.sort(div3Even, 0, evenCount);
                    Arrays.sort(others, 0, otherCount);
                    Arrays.sort(div3Odd, 0, oddCount);
                    for (int i = 0; i < oddCount / 2; i++) {
                        int temp = div3Odd[i];
                        div3Odd[i] = div3Odd[oddCount - i - 1];
                        div3Odd[oddCount - i - 1] = temp;
                    }
                    int index = 0;
                    for (int i = 0; i < evenCount; i++) arr[index++] = div3Even[i];
                    for (int i = 0; i < otherCount; i++) arr[index++] = others[i];
                    for (int i = 0; i < oddCount; i++) arr[index++] = div3Odd[i];
                    System.out.println("Mang da sap xep theo quy tac dac biet.");
                    break;
                case 8:
                    System.out.print("Nhap gia tri m: ");
                    int m = scanner.nextInt();
                    int i;
                    for (i = n - 1; (i >= 0 && arr[i] < m); i--) {
                        arr[i + 1] = arr[i];
                    }
                    arr[i + 1] = m;
                    n++;
                    System.out.println("Mang sau khi chen: ");
                    for (int j = 0; j < n; j++) {
                        System.out.print(arr[j] + " ");
                    }
                    System.out.println();
                    break;

                case 9:
                    System.out.println("Thoat chuong trinh!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Lua chon khong hop le!");
            }
        }
    }
}
