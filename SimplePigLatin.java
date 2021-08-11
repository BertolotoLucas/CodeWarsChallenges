//Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.
//pigIt('Pig latin is cool') returns: igPay atinlay siay oolcay
//pigIt('Hello world !')     returns:  elloHay orldway !

public class PigLatin {
    public static String pigIt(String str) {
        String[] words = str.split(" ");
        String result = new String();
        Character first;
        for(int i = 0; i<words.length; i++){
            first = new Character(words[i].charAt(0));
            if(Character.isLetter(first)) {
               result += words[i].substring(1,words[i].length());
               result += first+"ay";
            } else result += first;
          if(!(i+1 == words.length)) result +=" ";
        }
      return result;
    }
}