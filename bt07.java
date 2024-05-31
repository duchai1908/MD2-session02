package btsession02;

import java.util.Scanner;

public class bt07 {
    public static void main(String[] args) {
        int count =0;
        for(int i =2; count < 20; i++ ){
            int check = 1;
            for(int j =2; j<i;j++){
                if(i % j == 0){
                    check = 0;
                    break;
                }
            }
            if(check == 1){
                count++;
                System.out.println("Số thứ "+ count + " là: " +i);
            }
        }
    }
}
