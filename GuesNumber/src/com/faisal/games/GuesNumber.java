package com.faisal.games;

import java.util.Random;
import java.util.Scanner;

public class GuesNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di game tebak number");
        System.out.println("Apakah kamu siap ?");
        System.out.println("1. ya");
        System.out.println("2. tidak");
        System.out.print("Pilihan anda : ");
        Integer isReady = scanner.nextInt();

        if (isReady != 1) {
            System.exit(0);
        }

        while(isReady == 1) {
            System.out.println("Ayo kita mulai !");
            System.out.println("==========================");

            System.out.print("Tebak angka dari 1 - 20");
            System.out.println("\n==========================");
            Random random = new Random();
            int randomNum = random.nextInt(20 - 10 + 1) + 10;

            System.out.print("Masukan tebakan anda : ");
            int userInput = scanner.nextInt();
            System.out.println("\n==========================");

            while (randomNum != userInput) {
                if (randomNum < userInput) {
                    System.out.println("Angka terlalu besar");
                    System.out.print("Tebak lagi : ");
                    userInput = scanner.nextInt();
                    System.out.println("\n==========================");
                } else {
                    System.out.println("Angka terlalu kecil");
                    System.out.print("Tebak lagi : ");
                    userInput = scanner.nextInt();
                    System.out.println("\n==========================");
                }
            }

            if (randomNum == userInput) {
                System.out.println("Anda Benar !");
                System.out.println("==========================");
            }

            System.out.println("Mau main lagi ?");
            System.out.println("1. ya");
            System.out.println("2. tidak");
            System.out.print("Pilihan anda : ");
            System.out.println("\n==========================");
            isReady = scanner.nextInt();
        }
    }
}
