//Complete the solution so that it splits the string into pairs of two characters. If the string contains an odd number of characters then it should replace the missing second character of the final pair with an underscore ('_').
//StringSplit.solution("abc") returns {"ab", "c_"}

public class StringSplit {
    public static String[] solution(String s) {
      if(s.length() % 2 != 0) {
        StringBuilder newWord = new StringBuilder(s);
        newWord.append('_');        
        return newWord.toString().split("(?<=\\G.{2})");
      } else return s.split("(?<=\\G.{2})");         
    }
    
}