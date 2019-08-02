package com.anurag1;

public class IfThenElseCodeBlock {

    public static void main(String[] args) {
	boolean gameOver=true;
	int score=800;
	int levelCompleted=5;
	int bonus=100;

	if(gameOver == true){
	    int finalScore=score+(levelCompleted * bonus);
	    System.out.println("Final Score = " + finalScore);
    }

	int secondScore=10000;
	 levelCompleted = 8;
	 bonus = 200;

	 if(gameOver){
	     int secondFinalScore = secondScore+(levelCompleted * bonus);
	     System.out.println("Second Final Score = " + secondFinalScore);

     }
    }
}
/* calculating the high score of any game considering its bonus and level .formula : highscore+(bonus*Level),
the ans should be printed with the help of if or else statement. 
 */