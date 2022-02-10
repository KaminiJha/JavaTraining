// for prime print its prime else check if its armstrong or not
package day4.loops;

import java.util.Scanner;

public class Task4 {
    public static boolean isPrime(int n) {
        boolean flag = true;
        for (int i = 2; i * i < n; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static boolean isArmstrong(int n) {
        int originalNum = n;
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            sum = sum + (rem * rem * rem);
            n = n / 10;
        }
        return originalNum == sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num");
        int n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            if (i == 1) {
                System.out.println("1 is armstrong");
            } else if (isPrime(i)) {
                System.out.println(i + " is prime ");
            } else {
                if (isArmstrong(i)) {
                    System.out.println(i + " is armstrong ");
                } else {
                    System.out.println(i + " is neither prime nor armstrong");
                }
            }
        }
    }

}
