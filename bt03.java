package btsession02;

import java.util.Scanner;

public class bt03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số bất kỳ");
        int a = sc.nextInt();
        if(a>0 && a <10){
            switch (a){
                case 1 -> System.out.println("One");
                case 2 -> System.out.println("Two");
                case 3 -> System.out.println("Three");
                case 4 -> System.out.println("Four");
                case 5 -> System.out.println("Five");
                case 6 -> System.out.println("Six");
                case 7 -> System.out.println("Seven");
                case 8 -> System.out.println("Eight");
                case 9 -> System.out.println("Nine");
                default -> System.out.println("Out of ability");
            }
        }else if(a >= 10 && a < 20){
            int ones = a%10;
            switch (ones){
                case 0 -> System.out.println("Ten");
                case 1 -> System.out.println("Eleven");
                case 2 -> System.out.println("Twelve");
                case 3 -> System.out.println("Thirdteen");
                case 4 -> System.out.println("Fourteen");
                case 5 -> System.out.println("Fifteen");
                case 6 -> System.out.println("Sixteen");
                case 7 -> System.out.println("Seventeen");
                case 8 -> System.out.println("Eightteen");
                case 9 -> System.out.println("Nineteen");
            }
        } else if (a >= 20 && a <= 99) {
                int tens = a/10;
                int ones1 = a%10;
            switch (tens){
                case 2 -> System.out.println("twenty");
                case 3 -> System.out.println("thirty");
                case 4 -> System.out.println("forty");
                case 5 -> System.out.println("fifty");
                case 6 -> System.out.println("sixty");
                case 7 -> System.out.println("seventy");
                case 8 -> System.out.println("eighty");
                case 9 -> System.out.println("ninety");
            }
            System.out.println(" And ");
            switch (ones1){
                case 1 -> System.out.println("One");
                case 2 -> System.out.println("Two");
                case 3 -> System.out.println("Three");
                case 4 -> System.out.println("Four");
                case 5 -> System.out.println("Five");
                case 6 -> System.out.println("Six");
                case 7 -> System.out.println("Seven");
                case 8 -> System.out.println("Eight");
                case 9 -> System.out.println("Nine");
            }
        }

    }
}
