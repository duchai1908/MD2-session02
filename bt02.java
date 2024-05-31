package btsession02;

import java.util.Scanner;

public class bt02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập một số bất kỳ");
        float number1 = sc.nextFloat();
        if(number1 % 3 == 0 && number1 % 5 ==0){
            System.out.println("Chia hết cho 3 và 5");
        } else if (number1 % 3 == 0) {
            System.out.println("Chỉ chia hết cho 3");
        } else if (number1 % 5 == 0) {
            System.out.println("Chỉ chia hết cho 5");
        }else{
            System.out.println("Không chia hết cho 3 và 5");
        }
    }
}
