package btsession02;

import java.util.Scanner;

public class bt05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số đầu tiên");
        int firstNumber = sc.nextInt();
        System.out.println("Nhập vào số thứ 2");
        int secondNumber = sc.nextInt();
        int total = 0;
        for( int i = firstNumber; i <= secondNumber;i++){
            if(i%2 ==0){
                total += i;
            }
        }
        System.out.println("Tổng các số chẵn là: "+total);
    }
}
