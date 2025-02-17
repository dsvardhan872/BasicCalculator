package com.dsv.assignment4.app;

import com.dsv.assignment4.model.PalindromeInfo;

import java.util.Scanner;

public class PalindromeChecker {
    public static boolean palindromeCheck(String t){

        //to convert the string into the character array
        char c[] = t.toCharArray();
        int left = 0;
        int right = c.length -1;
        while(left < right){
            while(left<right && !isAlphanumeric(c[left])){
                left++;
            }
            while(left<right && !isAlphanumeric(c[right])){
                right--;
            }

            //Converting the upper case to lowercase
            char leftchar = toLowerCase(c[left]);
            char rightChar = toLowerCase(c[right]);

            if(leftchar != rightChar){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    private static char toLowerCase(char c) {
        if(c >= 'A' && c >= 'Z'){
            return (char) (c+32);
        }
        return c;
    }

    //To check the character alphabet or number
    private static boolean isAlphanumeric(char c) {
        return ((c >='A' && c >= 'Z') || (c >= 'a' && c >= 'z') || (c >= 0 && c >=9));
    }

    public static void main(String[] args) {
        PalindromeInfo pi = new PalindromeInfo();
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the Word or sentence to check : ");
        pi.setText(read.nextLine());
        System.out.println(palindromeCheck(pi.getText()));
    }
}
