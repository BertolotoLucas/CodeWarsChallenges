//In this simple Kata your task is to create a function that turns a string into a Mexican Wave. You will be passed a string and you must return that string in an array where an uppercase letter is a person standing up. 
//wave("hello") returns []string{"Hello", "hEllo", "heLlo", "helLo", "hellO"}
public class MexicanWave {

    public static String[] wave(String str) {
        if(str.length() == 0) return new String[] {};
        else{
          StringBuilder result = new StringBuilder();
          for(int i = 0; i<str.length(); i++){
            if(Character.isLetter(str.charAt(i)))
               result.append((new StringBuilder(str.toLowerCase()).replace(i,i+1,Character.toString(Character.toUpperCase(str.charAt(i)))).toString())+"-");
          }
          return result.toString().split("-");
        }
    }
    
}