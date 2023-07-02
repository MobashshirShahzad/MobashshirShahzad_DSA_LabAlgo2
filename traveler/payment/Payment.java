package com.gl.traveler.payment;
import java.util.Arrays;
import java.util.Scanner;

public class Payment {

	public static void main(String[] args) {
		try( Scanner scanner = new Scanner(System.in)){

        System.out.print("Enter the size of currency denominations: ");
        int size = scanner.nextInt();

        int[] denominations = new int[size];
        System.out.print("Enter the currency denominations values: ");
        for (int i = 0; i < size; i++) {
            denominations[i] = scanner.nextInt();
        }

        System.out.print("Enter the amount you want to pay: ");
        int amount = scanner.nextInt();

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
            }
        }
    }
  }
}
