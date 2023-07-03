package com.gl.paymoney.transaction;
import java.util.Scanner;

public class PayMoney {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the transaction array: ");
        int size = sc.nextInt();

        int[] transactions = new int[size];
        System.out.print("Enter the values of the array: ");
        for (int i = 0; i < size; i++) {
            transactions[i] = sc.nextInt();
        }

        System.out.print("Enter the total number of targets that need to be achieved: ");
        int numTargets = sc.nextInt();

        for (int targetIndex = 1; targetIndex <= numTargets; targetIndex++) {
            System.out.print("Enter the value of target: ");
            int target = sc.nextInt();
            int sum = 0;
            int transactionCount = 0;
            boolean targetAchieved = false;
            for (int i = 0; i < size; i++) {
                sum += transactions[i];
                transactionCount++;
                if (sum >= target) {
                    targetAchieved = true;
                    break;
                }
            }

            if (targetAchieved) {
                System.out.println("Target achieved after " + transactionCount + " transactions");
            } else {
                System.out.println("Given target is not achieved");
                sc.close();
            }
        }
    }
  }

