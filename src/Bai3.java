import java.util.Scanner;
import java.util.regex.Pattern;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String emailRegex = "^[a-zA-Z0-9][a-zA-Z0-9._-]*@[a-zA-Z0-9.-]+\\.(com|vn|org)$";
        String passwordRegex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%!&*]).{8,}$";

        String email, password;

        while (true) {
            System.out.print("Nhap email: ");
            email = scanner.nextLine();
            if (Pattern.matches(emailRegex, email)) {
                break;
            } else {
                System.out.println("Email khong hop le. Vui long nhap lai.");
            }
        }
        while (true) {
            System.out.print("Nhap mat khau: ");
            password = scanner.nextLine();
            if (Pattern.matches(passwordRegex, password)) {
                break;
            } else {
                System.out.println("Mat khau khong hop le. Vui long nhap lai.");
            }
        }
        System.out.println("Email va mat khau hop le!");
    }
}
