//Application: Program 6
//Name: Justin Lawrence 
//GitHub User: j-lawrence2022
//Date: nov 8 2022
//Version: 1.0
//Description: arrays and random class
import java.util.Random;
import java.util.Scanner;
public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//print out decription of game
		System.out.println("Welcome players today we are platying the game of pickleball");
		System.out.println("The game of pickle ball involves two teams of two players.");
		System.out.println("The players are placed in a field with a net and equiped with raskets and a single ball");
		System.out.println("The players determine how many innings they play between 1 and 100");
		System.out.println("Using the rackets one of the teams hits the ball and the other team attempls to hit it back  ");
		System.out.println("If a team is unable to return the ball the opposing team receivese a point.");
		System.out.println("The teams play for points and they play up to 20 points");
		System.out.println("Adding together all numbers from both teams we then determine how many points each team received at each inning. ");
System.out.println("--------------------------------------------------------------------------------------------------------");

//collect input for number of innings

System.out.println("How many innings do both teams want to play for pickleball today?");

Scanner keyboard = new Scanner(System.in);

int innings = keyboard.nextInt();

//Use while loop to limit between one and one hundred innings
while (innings <1 || innings > 100)
{
	System.out.println("This number of innings does not meet the required amount please choose another.");
	innings = keyboard.nextInt();
}


//create 2d array for a randomized score 
int[][] teamscorearray = new int[innings][2];
Random random = new Random(System.currentTimeMillis());


//create for loop for two different 2d arrays based on number of innings
for (int x =0; x<innings; x++)
		{
		teamscorearray[x][0] =  random.nextInt(20) +1;
		teamscorearray[x][1] = 20 - teamscorearray[x][0];
		}

//print out the two different teams
System.out.println("Team1: Team2:  " );
		int team1 = 0;
		int team2 = 0;
		for (int x = 0; x<innings; x++)
		{
			
			
			
			System.out.println(teamscorearray[x][0] + "       " +teamscorearray[x][1]);
			
			team1 += teamscorearray[x][0];
			team2 += teamscorearray[x][1];
			
		}
		System.out.println("Team 1 score is " +team1 );
		System.out.println("Team 2 has a score of " +team2);
		//printout team scores
		
		//Use following if statements to make conclusion from team scores
		if (team1 < team2)
		{
			System.out.println("Team 2 has won the game.");
		}
		
		if (team2 < team1)
		{
			System.out.println("Team 1 has won the game.");
		}
		
		if (2 == team1)
		{
			System.out.println("The two teams have tied.");
		}
		
		
		
		
		
		
		
		
		
	}

}
