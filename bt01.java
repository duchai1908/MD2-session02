package btsession02;

import java.util.Scanner;

public class bt01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 số (0-9)");
        int number1 = sc.nextInt();
        switch (number1) {
            case 0 -> System.out.println("Số Không");
            case 1 -> System.out.println("Số Một");
            case 2 -> System.out.println("Số Hai");
            case 3 -> System.out.println("Số Ba");
            case 4 -> System.out.println("Số Bốn");
            case 5 -> System.out.println("Số Năm");
            case 6 -> System.out.println("Số Sáu");
            case 7 -> System.out.println("Số Bảy");
            case 8 -> System.out.println("Số Tám");
            case 9 -> System.out.println("Số Chín");
            default -> System.out.println("Số không hợp lệ");
        }
    }
}
