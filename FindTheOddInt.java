//Given an array of integers, find the one that appears an odd number of times
public class FindOdd {
  public static int findIt(int[] a) {
    for(int i = 0; i < a.length; i++){
      int found = 0;
      for(int j = 0; j < a.length; j++){
        if(a[i] == a[j]) found++;
      } 
      if(found % 2 != 0 && found > 0) return a[i];
     }        
    return 0;
  }
}