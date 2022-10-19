package baiTap2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    public static void main(String[] args) {
        String emailPattern = "^\\d{2}[-][0]\\d{8,}$";
        System.out.println("Enter Phone: ");
        Scanner scanner = new Scanner(System.in);
        String phone = scanner.nextLine();
        Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(phone);
        System.out.println("Phone " + phone+ " is " + matcher.matches());
    }
}

