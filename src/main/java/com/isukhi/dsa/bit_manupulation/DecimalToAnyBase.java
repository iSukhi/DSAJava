package com.isukhi.dsa.bit_manupulation;

public class DecimalToAnyBase {
    /*
    Problem Description
    Given a decimal number A and a base B, convert it into its equivalent number in base B.

    Problem Constraints
    0 <= A <= 512
    2 <= B <= 10

    Input Format
    The first argument will be decimal number A.
    The second argument will be base B.

    Output Format
    Return the conversion of A in base B.

    Example Input
    Input 1:
    A = 4
    B = 3
    Input 2:
    A = 4
    B = 2

    Example Output
    Output 1:
    11
    Output 2:
    100

    Example Explanation
    Explanation 1:
    Decimal number 4 in base 3 is 11.
    Explanation 2:
    Decimal number 4 in base 2 is 100.
     */
    public int DecimalToAnyBase(int A, int B) {
        int div = 0, mod = 0, ans = 0, multiplier = 1;
        while (A >= 1) {
            mod = A % B;
            ans += mod * multiplier;
            multiplier *= 10;
            A = A/B;
        }
        return ans;
    }
}
