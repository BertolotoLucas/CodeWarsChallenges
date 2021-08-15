//Complete the solution so that it strips all text that follows any of a set of comment
//markers passed in. Any whitespace at the end of the line should also be stripped out.
//FOR EXAMPLE
//var result = solution("apples, pears # and bananas\ngrapes\nbananas !apples", ["#", "!"])
//result should == "apples, pears\ngrapes\nbananas"

public class StripComments {

	public static String stripComments(String text, String[] commentSymbols) {
    StringBuilder result = new StringBuilder("");
    boolean insertPlease = false;
    if(text.length()>0)
    for(int i=0;i<text.length();i++){
      insertPlease = true;
      char c = text.charAt(i);
      if(c==' '){
        if(i==text.length()-1){
          insertPlease = false;
        }
        for(int j = i+1; j<text.length();j++){         
          if(text.charAt(j)=='\n'){
            c = text.charAt(j);
            i = j;
            j = text.length();
          } else if(j==text.length()-1){
            insertPlease=false;            
            i = j;
          } else if((text.charAt(j)!=' ')){
              for(String symbolS:commentSymbols){
                char symbol = symbolS.charAt(0);
                if(text.charAt(j)==symbol){ 
                  for(int k = j+1; k<text.length();k++){ 
                     if(text.charAt(k)=='\n'){
                       c = text.charAt(k);
                       i = k;
                       j = text.length();
                       k = text.length();
                     } else if(k==text.length()-1){
                        insertPlease = false;
                        i = k;
                        j = text.length();
                        k = text.length();
                     }
                  }
                  break;
                }
              }
              j = text.length();            
          }
        }
      } else{
          for(String symbolS:commentSymbols){
            char symbol = symbolS.charAt(0);
            if(c == symbol){
              if(i==text.length()-1){ 
                insertPlease = false;
              } else
                for(int j = i+1; j<text.length();j++){
                char c2 = text.charAt(j);
                if(c2=='\n'){
                  c = c2;
                  i = j;
                  j = text.length();
                } else if(j==text.length()-1){
                    insertPlease = false;
                    i = j;
                }           
              }
            }
          }
      }
      if(insertPlease){
        result.append(c);
      }
    }
    return result.toString();
  }
}