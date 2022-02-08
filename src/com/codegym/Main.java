package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double money , interestRate , totalInterest = 0;
        int month;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập số tiền gửi : ");
        money=scanner.nextDouble();
        System.out.println("Nhập số tháng gửi");
        month=scanner.nextInt();
        System.out.println("Nhập lãi suất");
        interestRate=scanner.nextDouble();
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate/100)/12 * month;
        }
        System.out.println("Lãi nhận được là : "+ totalInterest);
    }
}
