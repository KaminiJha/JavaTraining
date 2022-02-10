package day4.loops;

import java.util.Scanner;

public class Task3 {
    // take paswrd input and calculate noo of lowercase uppercase digitsMy
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int lowerCaseCount = 0;
        int upperCaseCount = 0;
        int digitCount = 0;
        int n=str.length();
        for (int i = 0; i < n; i++) {
            // int asciiCh = (int)str.charAt(i);
            int asciiCh=str.codePointAt(i);//directly gives ascii
            if (asciiCh >= 65 && asciiCh <= 90) {
                upperCaseCount++;
            } else if (asciiCh >= 97 && asciiCh <= 122) {
                lowerCaseCount++;
            } else if (asciiCh >= 48 && asciiCh <= 57) {
                digitCount++;
            }
        }
        System.out.println("lower case " + lowerCaseCount + " upper case " + upperCaseCount + " digits are " + digitCount);
    }
}
