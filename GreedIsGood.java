/**
*Greed is a dice game played with five six-sided dice. Your mission, should you choose to accept it, is to score a throw according to these rules. You will always be given an array with five six-sided dice values.
* Throw       Score
* ---------   ------------------
* 5 1 3 4 1   250:  50 (for the 5) + 2 * 100 (for the 1s)
* 1 1 1 3 1   1100: 1000 (for three 1s) + 100 (for the other 1)
* 2 4 4 5 4   450:  400 (for three 4s) + 50 (for the 5)
*/

public class Greed{
  public static int greedy(int[] dice){
    int[] count = {0,0,0,0,0,0,0};
    for(int i = 0; i<dice.length; i++){
      if(dice[i]==1) count[1]++;
      if(dice[i]==2) count[2]++;
      if(dice[i]==3) count[3]++;
      if(dice[i]==4) count[4]++;
      if(dice[i]==5) count[5]++;
      if(dice[i]==6) count[6]++;
    }
    int point = 0;
    if(count[1]>=3){
      point += 1000;
      count[1] = count[1] - 3;
    }
    if(count[1]>0){
       point += (100 * count[1]);
       dice[1] = 0;
    }
    if(count[5]>=3){
      point += 500;
      count[5] = count[5] - 3;
    }
    if(count[5]>0){
       point += (50 * count[5]);
       count[5] = 0;
    }
    if(count[2]>=3){
       point += 200;
       count[2] = 0;
    }
    if(count[3]>=3){
       point += 300;
       count[3] = 0;
    }
    if(count[4]>=3){
       point += 400;
       count[4] = 0;
    }
    if(count[6]>=3){
       point += 600;
       count[6] = 0;
    }
    return point;
   }
}