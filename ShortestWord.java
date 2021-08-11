//Simple, given a string of words, return the length of the shortest word(s)
import java.util.Arrays;

public class Kata {
    public static int findShort(String s) {
        String[] words = s.split(" ");
        String word = new String();
        int smallest = 999;
        int n = words.length;
        for(int i = 0; i < n; i++){
          word = words[i];
          if(word.length() < smallest) smallest = word.length();
        }
        return smallest;
    }
}