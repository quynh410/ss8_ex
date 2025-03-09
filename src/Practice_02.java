import java.util.Arrays;
import java.util.Scanner;

public class Practice_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so hang va so cot: ");
        int n = scanner.nextInt(), m = scanner.nextInt();
        int[][] arr = new int[n][m];

        while (true) {
            System.out.println("\n************* MENU *************");
            System.out.println("1. Nhap mang");
            System.out.println("2. In mang");
            System.out.println("3. Dem so phan tu chia het cho 2 va 3");
            System.out.println("4. In so nguyen to");
            System.out.println("5. Sap xep tang dan theo cot");
            System.out.println("6. Sap xep duong cheo chinh giam dan");
            System.out.println("7. Chen mang vao dong");
            System.out.println("8. Thoat");
            System.out.print("Chon chuc nang: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Nhap gia tri cac phan tu:");
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            arr[i][j] = scanner.nextInt();
                        }
                    }
                    break;

                case 2:
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            System.out.print(arr[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    int count = 0;
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            if (arr[i][j] % 2 == 0 && arr[i][j] % 3 == 0) {
                                count++;
                            }
                        }
                    }
                    System.out.println("So phan tu chia het cho 2 va 3: " + count);
                    break;

                case 4:
                    System.out.print("Cac so nguyen to: ");
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            boolean isPrime = arr[i][j] > 1;
                            for (int k = 2; k * k <= arr[i][j]; k++) {
                                if (arr[i][j] % k == 0) {
                                    isPrime = false;
                                    break;
                                }
                            }
                            if (isPrime) {
                                System.out.print(arr[i][j] + " ");
                            }
                        }
                    }
                    System.out.println();
                    break;

                case 5:
                    for (int j = 0; j < m; j++) {
                        for (int i = 0; i < n - 1; i++) {
                            int minIdx = i;
                            for (int k = i + 1; k < n; k++) {
                                if (arr[k][j] < arr[minIdx][j]) {
                                    minIdx = k;
                                }
                            }
                            int temp = arr[i][j];
                            arr[i][j] = arr[minIdx][j];
                            arr[minIdx][j] = temp;
                        }
                    }
                    System.out.println("Mang sau khi sap xep cot:");
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            System.out.print(arr[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 6:
                    if (n == m) {
                        int[] diagonal = new int[n];
                        for (int i = 0; i < n; i++) {
                            diagonal[i] = arr[i][i];
                        }
                        Arrays.sort(diagonal);
                        for (int i = 0; i < n; i++) {
                            arr[i][i] = diagonal[n - 1 - i];
                        }

                        System.out.println("Mang sau khi sap xep duong cheo chinh:");
                        for (int i = 0; i < n; i++) {
                            for (int j = 0; j < m; j++) {
                                System.out.print(arr[i][j] + " ");
                            }
                            System.out.println();
                        }
                    } else {
                        System.out.println("Mang khong vuong, khong the sap xep duong cheo!");
                    }
                    break;

                case 7:
                    System.out.print("Nhap mang 1 chieu can chen (" + m + " phan tu): ");
                    int[] row = new int[m];
                    for (int i = 0; i < m; i++) {
                        row[i] = scanner.nextInt();
                    }

                    System.out.print("Nhap chi so dong can chen: ");
                    int index = scanner.nextInt();
                    if (index < 0 || index > n) {
                        System.out.println("Chi so dong khong hop le!");
                    } else {
                        int[][] newArr = new int[n + 1][m];
                        for (int i = 0, k = 0; i <= n; i++) {
                            if (i == index) {
                                newArr[i] = row.clone();
                            } else {
                                newArr[i] = arr[k++];
                            }
                        }
                        arr = newArr;
                        n++;

                        System.out.println("Mang sau khi chen:");
                        for (int i = 0; i < n; i++) {
                            for (int j = 0; j < m; j++) {
                                System.out.print(arr[i][j] + " ");
                            }
                            System.out.println();
                        }
                    }
                    break;

                case 8:
                    System.out.println("Thoat chuong trinh!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Lua chon khong hop le!");
                    break;
            }
        }
    }
}
