package btsession02;

import java.util.Scanner;

public class bt08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        boolean check = true;
        int choice;
        int check1 = 1;
        while (flag){
            do {
                System.out.println("Nhập vào lựa chọn của bạn");
                System.out.println("1. Kiểm tra tính chẵn lẻ của 1 số");
                System.out.println("2. Kiểm tra số nguyên tố");
                System.out.println("3. Kiểm tra 1 số có chia hết cho 3 không");
                System.out.println("4. Thoát");
                choice = sc.nextInt();
                if(choice < 1 || choice > 4){
                    System.out.println("Nhập sai, vui lòng nhập lại");
                }else{
                    check = false;
                }
            }while (check);
            System.out.println("Nhập số bạn muốn kiểm tra");
            int numberSelect = sc.nextInt();
            switch (choice){
                case 1: if(numberSelect % 2 == 0){
                            System.out.println("Số chẵn");
                        }else{
                            System.out.println("Số lẻ");
                        }break;
                case 2: for(int i = 2; i < numberSelect;i++){
                            check1 = 1;
                            if(numberSelect % i == 0){
                                check1 = 0;
                                break;
                            }
                        }
                        if(check1 == 1){
                            System.out.println("Là số nguyên tố");
                        }else{
                            System.out.println("K phải số nguyên tố");
                        } break;
                case 3: if(numberSelect %3 ==0){
                            System.out.println("Chia hết cho 3");
                        }else {
                            System.out.println("Không chia hết cho 3");
                        } break;
                case 4: flag = false;
                        break;
            }
        }
    }
}
