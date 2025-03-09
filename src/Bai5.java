import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = null;
        int n = 0;

        while (true) {
            System.out.println("********************** MENU **********************");
            System.out.println("1. Nhap gia tri 'n' phan tu cua mang ('n' nhap tu ban phim)");
            System.out.println("2. In gia tri cac phan tu trong mang");
            System.out.println("3. Tinh trung binh cac phan tu duong ('>0') trong mang");
            System.out.println("4. In ra vi tri (chi so) cac phan tu co gia tri bang 'k' trong mang ('k' nhap tu ban phim)");
            System.out.println("5. Tinh so luong cac phan tu la so nguyen to trong mang");
            System.out.println("6. Thoat chuong trinh");
            System.out.print("Chon chuc nang: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhap so luong phan tu n: ");
                    n = scanner.nextInt();
                    arr = new int[n];
                    System.out.println("Nhap cac phan tu:");
                    for (int i = 0; i < n; i++) {
                        System.out.print("arr[" + i + "] = ");
                        arr[i] = scanner.nextInt();
                    }
                    break;

                case 2:
                    if (arr == null) {
                        System.out.println("Mang chua duoc nhap!");
                    } else {
                        System.out.print("Cac phan tu trong mang: ");
                        for (int num : arr) {
                            System.out.print(num + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    if (arr == null) {
                        System.out.println("Mang chua duoc nhap!");
                    } else {
                        double sum = 0;
                        int count = 0;
                        for (int num : arr) {
                            if (num > 0) {
                                sum += num;
                                count++;
                            }
                        }
                        if (count == 0) {
                            System.out.println("Khong co phan tu duong trong mang!");
                        } else {
                            System.out.println("Trung binh cong cac so duong: " + (sum / count));
                        }
                    }
                    break;

                case 4:
                    if (arr == null) {
                        System.out.println("Mang chua duoc nhap!");
                    } else {
                        System.out.print("Nhap gia tri k: ");
                        int k = scanner.nextInt();
                        System.out.print("Cac vi tri co gia tri " + k + " trong mang: ");
                        boolean found = false;
                        for (int i = 0; i < arr.length; i++) {
                            if (arr[i] == k) {
                                System.out.print(i + " ");
                                found = true;
                            }
                        }
                        if (!found) {
                            System.out.println("Khong co phan tu nao co gia tri " + k);
                        } else {
                            System.out.println();
                        }
                    }
                    break;

                case 5:
                    if (arr == null) {
                        System.out.println("Mang chua duoc nhap!");
                    } else {
                        int primeCount = 0;
                        for (int num : arr) {
                            if (num >= 2) {
                                boolean isPrime = true;
                                for (int i = 2; i <= Math.sqrt(num); i++) {
                                    if (num % i == 0) {
                                        isPrime = false;
                                        break;
                                    }
                                }
                                if (isPrime) {
                                    primeCount++;
                                }
                            }
                        }
                        System.out.println("So luong so nguyen to trong mang: " + primeCount);
                    }
                    break;

                case 6:
                    System.out.println("Thoat chuong trinh!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Lua chon khong hop le! Vui long chon lai.");
            }
        }
    }
}
