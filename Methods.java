


public class Methods {

    public static void main(String[] args) {
int playerPosition =calculateHighScorePosition(1500);
displayHighScorePosition("Kyrie", playerPosition);

playerPosition =calculateHighScorePosition(900);
displayHighScorePosition("Lebron James",playerPosition);

playerPosition=calculateHighScorePosition(400);
displayHighScorePosition("Jmaes Harden",playerPosition);

playerPosition=calculateHighScorePosition(50);
displayHighScorePosition("Zack Efron",playerPosition);

    }
    public static void displayHighScorePosition(String playerName,int playerPosition){
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score table");


    }
    public static int calculateHighScorePosition(int playerScore){
        if(playerScore >= 1000){
            return 1;
        }
        else if(playerScore >= 500 && playerScore <1000){
            return 2;
        }
        else if(playerScore >= 100 && playerScore <500){
            return 3;
        }
        else{
            return 4;}
    }
}
/*

1.create a method called displayHighScorePosition
2.it should a player name as a parameter, and a 2nd parameter as a position in the high score table
3.you should display the player name along with a message like " managed to get into position"
and theposition they got and a further message like " on the high score table".


4.create a 2nd method called calculateHighScorePosition
5.it should be sent one argument only, the player score
 6.it should return int
 7.the return an int
 8.the return adata should be
 1 if score is >= 1000
 2 if score is >=500 and <1000
 3 if score is >= 100 and <500
 4 in all the cases
 call both the methods and display the result of the following
 a score of 1500, 900, 400 and 50

 */