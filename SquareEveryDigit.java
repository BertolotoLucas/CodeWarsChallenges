//For example, if we run 9119 through the function, 811181 will come out, because 9^2 is 81 and 1^2 is 1.
public class SquareDigit {

  public int squareDigits(int n) {
    String entry = new String(String.valueOf(n));
    int number = 0;
    String exit = new String();
    for(int i = 0; i<entry.length(); i++){
      number = Character.getNumericValue(entry.charAt(i)); 
      number = number*number;
      exit += String.valueOf(number);
    }
    if (exit.length()==0) return 0;
    return Integer.parseInt(exit);
    
  }

}