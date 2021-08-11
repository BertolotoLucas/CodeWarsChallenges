//The new "Avengers" movie has just been released! There are a lot of people at the cinema box office standing in a huge line. Each of them has a single 100, 50 or 25 dollar bill. An "Avengers" ticket costs 25 dollars.
//Vasya is currently working as a clerk. He wants to sell a ticket to every single person in this line.
//Can Vasya sell a ticket to every person and give change if he initially has no money and sells the tickets strictly in the order people queue?

//Line.Tickets(new int[] {25, 25, 50}) returns YES 
//Line.Tickets(new int[] {25, 100}) returns  NO. (Vasya will not have enough money to give change to 100 dollars)
//Line.Tickets(new int[] {25, 25, 50, 50, 100}) returns NO. (Vasya will not have the right bills to give 75 dollars of change (you can't make two bills of 25 from one of 50))

public class Line {
  public static String Tickets(int[] peopleInLine)
  {
        int troco[] = new int[3]; //"25""50""100"
        for(int i = 0; i<peopleInLine.length;i++){
          if(peopleInLine[i]==25){
            troco[0]++;
          } 
          else if(peopleInLine[i] == 50){
            if(troco[0]>0){
               troco[0]--;
               troco[1]++;
            } else return "NO";
          }
          else if(peopleInLine[i] == 100){
            if(troco[1]>=1 && troco[0]>=1){
              troco[0]--;
              troco[1]--;
              troco[2]++;
            }
            else if(troco[0]>=3){
              troco[0] = troco[0] - 3;
              troco[2]++;
            }
            else return "NO";
          }
        }
        return "YES";
  }
}