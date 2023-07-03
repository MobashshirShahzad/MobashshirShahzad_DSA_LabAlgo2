package com.gl.traveler.payment;
import java.util.Scanner;
import java.util.Arrays;


public class Payment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of currency denominations: ");
        int size = sc.nextInt();

        int[] denominations = new int[size];
        System.out.print("Enter the currency denominations values: ");
        for (int i = 0; i < size; i++) {
            denominations[i] = sc.nextInt();
        }

        System.out.print("Enter the amount you want to pay: ");
        int amount = sc.nextInt();

        Arrays.sort(denominations);
        int[] notesCount = new int[size];

        for (int i = size - 1; i >= 0; i--) {
            if (amount >= denominations[i]) {
                notesCount[i] = amount / denominations[i];
                amount = amount % denominations[i];
            }
        }

        System.out.println("Your payment approach in order to give the minimum number of notes will be:");
        for (int i = size - 1; i >= 0; i--) {
            if (notesCount[i] > 0) {
                System.out.println(denominations[i] + ":" + notesCount[i]);
                sc.close();
            }
        }
    }
  }

