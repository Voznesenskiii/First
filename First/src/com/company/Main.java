package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	    // нам надо получить пользователей
        int n;
        do {
            System.out.println("Получить число:");
            n = sc.nextInt();
        }
        while (n < 1);
        System.out.println("Вы ввели верное число!");

        int ages[n];

        for (int i = 0; i < n; i++);
        {
            System.out.println("sdfsdfsd", i+1);
            ages[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++);
        {
            System.out.println("возраст :" + (n+1) + (ages[n]+1));

        }

    }

}
