//Write a program that will calculate the number of trailing zeros in a factorial of a given number.
//# 6! = 1 * 2 * 3 * 4 * 5 * 6 = 720 --> 1 trailing zero

public class Solution {
  public static int zeros(int n) {
      //divide the number by 5^1, 5^2, 5^3 .... to know the number of zeros
    int zeros = 0;
    for(int i = 5; i<=n; i=i*5){
      zeros += Math.floor(n/i); 
    }
    return zeros;
  }
}