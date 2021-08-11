//Kata.getMiddle("test") should return "es"
//Kata.getMiddle("testing") should return "t"

class Kata {
  public static String getMiddle(String word) {
    int t = word.length();
    if(t > 1){
      String result = new String();
      int middle = t/2;
      if (t % 2 == 0){
        result += word.charAt(middle-1);
        result += word.charAt(middle);
        return result;
      }
      result += word.charAt(middle);
      return result;
    }
    return word;
  }
}