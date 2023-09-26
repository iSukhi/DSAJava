package com.isukhi.dsa.bit_manupulation;

public class AnyBaseToDecimal {
    /*
    You are given a number A. You are also given a base B. A is a number on base B.
    You are required to convert the number A into its corresponding value in decimal number system.
    Example Input

    Input 1:
    A = 1010
    B = 2

    Input 2:
    A = 22
    B = 3

    Example Output
    Output 1:
    10
    Output 2:
    8
    */

    public int solve(int A, int B) {
        //Extract digits from a number
        int ans = 0;
        int placeOfDigitInNumber = 0;
        while (A > 0) {
            int lastNumber = A % 10;
            ans += (int) (lastNumber * Math.pow(B, placeOfDigitInNumber));
            placeOfDigitInNumber += 1;
            A = A / 10;
        }
        return ans;
    }
}
