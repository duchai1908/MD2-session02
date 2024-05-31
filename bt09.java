package btsession02;

import java.util.Scanner;

public class bt09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int choice;
        boolean check = true;
        while (flag){
            do {
                System.out.println("Nhập vào lựa chọn của bạn");
                System.out.println("1. Kiểm tra chu vi và diện tích hình chữ nhật");
                System.out.println("2. Tính chu vi và diện tích tam giác");
                System.out.println("3. Tính chu vi và diện tích hình tròn");
                System.out.println("4. Thoát");
                choice = sc.nextInt();
                if(choice < 1 || choice > 4){
                    System.out.println("Nhập sai, vui lòng nhập lại");
                }else{
                    check = false;
                }
            }while (check);
            switch (choice){
                case 1:
                    System.out.println("Nhập chiều dài");
                    int chieuDai = sc.nextInt();
                    System.out.println("Nhập vào chiều rộng");
                    int chieuRong = sc.nextInt();
                    int chuvi = (chieuRong + chieuDai)*2;
                    int dientich = chieuDai * chieuRong;
                    System.out.println("Chu vi là: "+chuvi+" diện tích là: "+dientich);
                    break;
                case 2:
                    System.out.println("Nhập vào cạnh đáy");
                    int canhDay = sc.nextInt();
                    System.out.println("Nhập vào cạnh 1 của tam giác");
                    int canhBen = sc.nextInt();
                    System.out.println("Nhập vào cạnh của 1 tam giác");
                    int canhBen1 = sc.nextInt();
                    System.out.println("Nhập vào chiều cao của 1 tam giác");
                    float chieuCao = sc.nextFloat();
                    int chuViTamGiac = canhBen1 + canhBen + canhDay;
                    float dienTichTamGiac = 0.5F * canhDay * chieuCao;
                    System.out.println("Chu vi tam giác là: "+chuViTamGiac);
                    System.out.println("Diện tích tam giác là: " +dienTichTamGiac);
                    break;
                case 3:
                    System.out.println("Nhập vào bán kính hình tròn");
                    int banKinh = sc.nextInt();
                    float chuViHinhTron = (banKinh*2) * 3.14F;
                    float dienTichHinhTron = (float)Math.pow(banKinh,2) * 3.14F;
                    System.out.println("Chu vi là: "+chuViHinhTron + " diện tích là: "+dienTichHinhTron);
                    break;
                case 4: flag = false;
                    break;
            }
        }
    }
}
