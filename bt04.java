package btsession02;

import java.util.Scanner;

public class bt04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào điểm Toán");
        float diemToan = sc.nextFloat();
        System.out.println("Nhập vào điểm Lý");
        float diemLy = sc.nextFloat();
        System.out.println("Nhập vào điểm Hoá");
        float diemHoa = sc.nextFloat();
        System.out.println("Nhập vào điểm Văn");
        float diemVan = sc.nextFloat();
        System.out.println("Nhập vào điểm Tiếng Anh");
        float diemTa = sc.nextFloat();
        float dtb = (diemTa + diemHoa + diemLy + diemVan + diemToan)/5;
        if(dtb >=9){
            System.out.println("Xếp loại xuất sắc");
        }else if(dtb>=8 && dtb <9){
            System.out.println("Xếp loại giỏi");
        } else if (dtb>= 6.5 && dtb <8) {
            System.out.println("Xếp loại khá");
        } else if (dtb >=5 && dtb <6.5) {
            System.out.println("Xếp loại trung bình");
        } else if (dtb >=0 && dtb <5) {
            System.out.println("Xếp loại yếu");
        }
    }
}
