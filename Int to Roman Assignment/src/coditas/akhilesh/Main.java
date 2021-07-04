package coditas.akhilesh;

import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in); //To take Roman number input
    public static void main(String[] args) {
        System.out.print("Enter the Roman number: ");
        String roman = scan.nextLine();
        int result = 0; //Setting the conversion number
        for (int i = 0;i<roman.length();i++){
            int v1 = value(roman.charAt(i));
            if (i + 1 < roman.length()) {
                int v2 = value(roman.charAt(i + 1));
                if (v1 >= v2) {
                    result = result + v1;
                }
                else {
                    result = result + v2 - v1;
                    i++;
                }
            }
            else {
                result = result + v1;
            }
        }
        System.out.println(result);
    }
    /*
    Function to return the value assigned to the letter in Roman Numerical System
     */
    public static int value(char r){
        if (r == 'I') {
            return 1;
        }
        if (r == 'V') {
            return 5;
        }
        if (r == 'X') {
            return 10;
        }
        if (r == 'L') {
            return 50;
        }
        if (r == 'C') {
            return 100;
        }
        if (r == 'D') {
            return 500;
        }
        if (r == 'M') {
            return 1000;
        }
        return -1;
    }
}