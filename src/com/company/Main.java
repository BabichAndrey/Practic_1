package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите колличество купюр номинала  1000:");
        int thousand = in.nextInt();
        System.out.print("Введите колличество купюр номинала  500:");
        int fiveHundred= in.nextInt();
        System.out.print("Введите колличество купюр номинала  100:");
        int hundred = in.nextInt();
        System.out.print("Введите колличество купюр номинала  30:");
        int thirty = in.nextInt();
        System.out.println();
        System.out.println("Введите желаемую сумму");
        int want = in.nextInt();
        boolean flag = true;
        int max = thousand * 1000 + fiveHundred * 500 + hundred * 100 + thirty * 30;
        if(max < want || want % 10 != 0 ){
            System.out.println("Невозможно выдать!");
        }else {
            for(int i = 0;i < thirty + 1;i++){
                for(int j = 0;j < hundred + 1 ; j++){
                    for(int k = 0; k < fiveHundred + 1;k++){
                        for(int f = 0;f < thousand + 1;f++){
                            if(i * 30 + j * 100 + k * 500 + f * 1000 == want){
                                System.out.println("Держите " + i + " тридцаток");i = thirty + 2;
                                System.out.println("Держите " + j + " сотен");j = hundred + 2;
                                System.out.println("Держите " + k + " пятьсотен"); k = fiveHundred + 2;
                                System.out.println("Держите " + f + " тысяч"); f = thousand + 2;
                                flag = false;
                            }
                        }
                    }
                }
            }
            if(flag){
                System.out.println("Невозможно выдать!");
            }
        }

    }
}
