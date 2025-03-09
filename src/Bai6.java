import java.util.Scanner;

public class  Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("============MENU CHÍNH==============");
            System.out.println("1. Xử lý chuỗi");
            System.out.println("2. Xử lý số nguyên");
            System.out.println("3. Thoát chương trình");
            System.out.print("Vui lòng chọn 1 - 3 : ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    boolean stringProcess = true;
                    while (stringProcess) {
                        System.out.println("==============MENU XỬ LÝ CHUỖI=======================");
                        System.out.println("1. Nhập chuỗi");
                        System.out.println("2. Loại bỏ khoảng trắng thừa trong chuỗi");
                        System.out.println("3. Đếm số lần xuất hiện của từng ký tự");
                        System.out.println("4. Chuyển đổi chuỗi thành dạng chuẩn (viết hoa chữ cái đầu mỗi từ)");
                        System.out.println("5. Quay lại menu chính");
                        System.out.print("Vui lòng chọn 1 - 5 :");
                        int stringChoice = Integer.parseInt(scanner.nextLine());
                        String inputText = "";
                        switch (stringChoice) {
                            case 1:
                                System.out.println("Nhập chuỗi bất kì : ");
                                inputText = scanner.nextLine();
                                break;
                            case 2:
                                inputText = inputText.trim().replaceAll("\\s+", " ");
                                System.out.println("Chuỗi sau khi loại bỏ khoảng trắng thừa là : "+inputText);
                                break;
                            case 3:
                                int[] charCount = new int[256];
                                for (char c : inputText.toCharArray()) {
                                    charCount[c]++;
                                }

                                System.out.println("Số lần xuất hiện của từng ký tự:");
                                for (char c = 0; c < charCount.length; c++) {
                                    if (charCount[c] > 0) {
                                        System.out.println(c + ": " + charCount[c]);
                                    }
                                }
                                break;
                            case 4:
                                String[] words = inputText.split(" ");
                                String formattedString = "";

                                for (String word : words) {
                                    if (!word.isEmpty()) {
                                        formattedString += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
                                    }
                                }

                                System.out.println("Chuỗi chuẩn: " + formattedString.trim());
                                break;
                            case 5:
                                stringProcess = false;
                                break;
                            default:
                                System.out.println("Vui lòng chọn lại yêu cầu 1 -5");

                        }

                    }
                    break;
                case 2:
                    boolean numberProcess = true;
                    System.out.print("Nhập số phần tử của mảng: ");
                    int n = Integer.parseInt(scanner.nextLine());
                    int[] numbers = new int[n];
                    for (int i = 0; i < n; i++) {
                        System.out.printf("numbers[%d] = ", i);
                        numbers[i] = Integer.parseInt(scanner.nextLine());
                    }
                    while (numberProcess) {
                        System.out.println("============MENU XỬ LÝ MẢNG SỐ NGUYÊN==============");
                        System.out.println("1. Nhập mảng số nguyên");
                        System.out.println("2. Tìm số nguyên tố lớn nhất trong mảng");
                        System.out.println("3. Đếm số phần tử có chữ số đầu tiên là số lẻ");
                        System.out.println("4. Kiểm tra mảng có phải là mảng đối xứng không");
                        System.out.println("5. Quay lại menu chính");
                        System.out.println("Chọn chức năng (1 - 5) : ");
                        int numberChoice = Integer.parseInt(scanner.nextLine());

                        switch (numberChoice) {
                            case 1:
                                System.out.println("Các phần tử trong mảng là : ");
                                for (int i = 0; i < n; i++) {
                                    System.out.printf("%d \t",numbers[i]);
                                }
                                System.out.println();
                                break;
                            case 2:
                                int max = Integer.MIN_VALUE;
                                for (int i = 0; i < n; i++) {
                                    for (int j = 2; j <= Math.sqrt(numbers[i]); j++) {
                                        if (numbers[i] % j == 0) {
                                            break;
                                        }
                                    }
                                }
                                System.out.println("Số nguyên tố lớn nhất trong mảng là : "+max);
                                break;
                            case 3:
                                int count = 0;
                                for (int num : numbers) {
                                    int firstDigit = Math.abs(num);
                                    while (firstDigit >= 10) {
                                        firstDigit /= 10;
                                    }
                                    if (firstDigit % 2 != 0) {
                                        count++;
                                    }
                                }
                                System.out.println("Số phần tử có chữ số đầu tiên là số lẻ: " + count);

                                break;
                            case 4:
                                boolean isSymmetric = true;
                                for (int i = 0; i < n / 2; i++) {
                                    if (numbers[i] != numbers[n - 1 - i]) {
                                        isSymmetric = false;
                                        break;
                                    }
                                }

                                System.out.println(isSymmetric ? "Mảng đối xứng" : "Mảng không đối xứng");

                                break;
                            case 5:
                                numberProcess = false;
                                break;
                            default:
                                System.out.println("Vui lòng chọn lại yêu cầu 1 -5");
                        }

                    }
                    break;

                case 3:
                    System.exit(0);
                default:
                    System.out.println("Vui lòng chọn lại yêu cầu 1 - 3");
            }
        }while (true);
    }
}
