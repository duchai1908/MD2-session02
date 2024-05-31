package btsession02;

import java.util.Scanner;

public class bt06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        boolean flag = true;
        while(flag){
            if(n % 5 ==0 && n % 7 == 0 && n % 11 ==0){
                break;
            }
            n++;
        }
        System.out.println("Số bé nhất chia hết cho 5,7,11 là: "+n);
    }
}
