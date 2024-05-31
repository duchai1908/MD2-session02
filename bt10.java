package btsession02;

import java.util.Scanner;

public class bt10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        int canh1 = 0;
        int canh2 = 0;
        int canh3 = 0;
        while (check) {
            do {
                System.out.println("Nhập vào cạnh 1");
                canh1 = sc.nextInt();
                System.out.println("Nhập vào cạnh 2");
                canh2 = sc.nextInt();
                System.out.println("Nhập vào cạnh 3");
                canh3 = sc.nextInt();
                if (canh1 < 0 || canh2 < 0 || canh3 < 0) {
                    check = true;
                } else {
                    check = canh1 + canh2 < canh3 || canh1 + canh3 < canh2 || canh2 + canh3 < canh1;
                }
                if (check) {
                    System.out.println("Nhập sai, nhập lại");
                }
            } while (check);
        }

        System.out.println("Nhập vào chiều cao của 1 tam giác");
        float chieuCao = sc.nextFloat();
        int chuViTamGiac = canh1 + canh2 + canh3;
        float dienTichTamGiac = 0.5F * canh1 * chieuCao;
        System.out.println("Chu vi tam giác là: " + chuViTamGiac);
        System.out.println("Diện tích tam giác là: " + dienTichTamGiac);
    }
}
