package com.company.talabat;
/*
Let's write a function to calculate the exponent of a given number,
our function takes 2 numbers and returns x^y where x & y are the inputs to the function.

Solution:
  1 2 3 4 5 6 7 8 9 10
  Multiply all by default - Complexity O(n)

  2 4 8 16          1024
    4^2 = 16
       Here we have duplicated computing, can skip it to reach complexity O(log(N))
 */
public class Powering {
    public int power(int base, int exp) {
        int result = 1;
        while (exp != 0)
        {
            if ((exp & 1) == 1)
                result *= base;
            exp >>= 1;
            base *= base;
        }
        return result;
    }
}
