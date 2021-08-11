//the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.
public class Solution {
  public int solution(int number) {
    int soma = 0;
    for(int i = number-1; i>0; i--){
      if(i % 3 == 0 || i % 5 == 0){
        soma += i;  
      }
    }
    return soma;
  }
}