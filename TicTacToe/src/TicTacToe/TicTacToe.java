/** COP 2551: Homework 7 -TicTacToe
* A program that uses a loop to go between one persons turn in tic tac toe to another. 
* The loop uses if statements to make sure the space is not preoccupied by another player and to make
* sure that the user inputs a number actual in the grid.
* The loop statement also has if statements regarding if you won or it is a tie and terminates program if one of these thing happen.
*
* @Brandi Lauria
* Instructor: Anirban Ghosh
* Course: COP2551
* Homework 7
*/
package TicTacToe;

import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) 
	{//main method begins
		// TODO Auto-generated method stub

		
		//declare character Array and initialize
				char[][] board2= {{' ',' ',' '},{' ',' ', ' '}, {' ',' ',' '}};
		//shows user board 
				System.out.print( "\n        "+ "| " +board2[0][0] + " | " + board2[0][1] + " | " + board2[0][2] + " |\n" + 
						"        --------------\n"+
						"        | "+board2[1][0] + " | " + board2[1][1] + " | " + board2[1][2] + " |  \n" +
						"        --------------\n"+
						"        | " +board2[2][0] + " | " + board2[2][1] + " | " + board2[2][2] +" |\n\n");
				
				//set players and second players choosen characters initialized
				char PlayersChoosenCharacter = 'X';
				char SecondPlayersChoosenCharacter = 'O';
				//loop intitialized
				int i= 0;
			// loop for first persons turn and second persons	
			while(i!=10 || i !=11 || i != 12)
			{//While loop begins
				
				//Get input from first player, for location of X
				Scanner scan = new Scanner(System.in);
				System.out.print( "Enter a row (0, 1, or 2) for player X:");
				String PlayersChoosenCharacterrow=scan.next();
				int playerRow=  (Integer.parseInt(PlayersChoosenCharacterrow));
				System.out.print( "Enter a column (0, 1, or 2) for player X:");
				String PlayersChoosenCharactercolumn=scan.next();
				int playerColumn=  (Integer.parseInt(PlayersChoosenCharactercolumn)); 
				//if statement regarding if invalid number entered
				if(playerRow>2||playerRow<0||playerColumn>2||playerColumn<0)
				{//begin if statement
					System.out.print("Error: You have choosen a spot that is outside of the game board\n");
					continue;
				}//end if statement
				
				//if statement for if players location is already taken
				 if(board2 [playerRow][playerColumn] == 'X'||board2 [playerRow][playerColumn] == 'O')
				{//begin if statement
					System.out.print("Error: You have choosen a spot already occupied choose another space\n");
					continue;
				}//end if statement
				 
				 //else if statement if player location is available
				else if(board2 [playerRow][playerColumn] == ' ')
					
				{//begin else if statement
					
					//print board with players input
					board2 [playerRow][playerColumn]=PlayersChoosenCharacter;
				System.out.print( "\n        "+ "| " +board2[0][0] + " | " + board2[0][1] + " | " + board2[0][2] + " |\n" + 
						"        --------------\n"+
						"        | "+board2[1][0] + " | " + board2[1][1] + " | " + board2[1][2] + " |  \n" +
						"        --------------\n"+
						"        | " +board2[2][0] + " | " + board2[2][1] + " | " + board2[2][2] +" |\n\n");
				//nested if statement to check if the player won
				 if(board2[0][0] =='X' && board2[0][1]=='X'&&board2[0][2] =='X'||board2[1][0] =='X' && board2[1][1]=='X'&&board2[1][2]=='X'||
							board2[2][0] =='X' && board2[2][1]=='X' &&board2[2][2]=='X'	|| board2[0][0]=='X'&&board2[1][0]=='X'&&board2[2][0]=='X'||
							board2[0][1]=='X'&& board2[1][1]=='X'&&board2[2][1]=='X'||board2[0][2] =='X' && board2[1][2]=='X'&&board2[2][2]=='X'||
							board2[0][0]=='X' && board2[1][1]=='X'&&board2[2][2]=='X'||board2[0][2]=='X' &&board2[1][1]=='X'&&board2[2][0]=='X')
				 {//begin nested if statement if won break
					 System.out.print( "X player won");
					 i=10;
					 break;
					 }//end nested if statement
				 //if statement for if there is a tie
				 if (board2[0][0]!=' ' && board2[0][1]!=' '&& board2[0][2]!=' '
							&& board2[1][0]!=' '&& board2[1][1]!=' '&& board2[1][2]!=' '&& 
							board2[2][0]!=' '&& board2[2][1]!=' '&& board2[2][2]!=' ')
				 {//nested if statement for tie begins
						System.out.print( "It's a tie");
								i = 12;
					break;
					}//nested if statement for tie ends
				
				}//end else if statement
				
				//initialize a variable for loop for Second Player
				int k =0;
				while(k!=11)
				{//begins loop for Second Player
				Scanner SecondPlayer = new Scanner(System.in);
				System.out.print( "Enter a row (0, 1, or 2) for player O:");
				String SecondPlayersChoosenCharacterrow=scan.next();
				int SecondplayerRow=  (Integer.parseInt(SecondPlayersChoosenCharacterrow));
				System.out.print( "Enter a column (0, 1, or 2) for player O:");
				String SecondPlayersChoosenCharactercolumn=scan.next();
				int SecondplayerColumn=  (Integer.parseInt(SecondPlayersChoosenCharactercolumn)); 
				
				if(SecondplayerRow>2||SecondplayerRow<0||SecondplayerColumn>2||SecondplayerColumn<0)
				{//begins if statement for error of numbers choosen outside on grid
					System.out.print("Error: You have choosen a spot that is outside of the game board\n");
					continue;
				}//end if statement
				
				if(board2 [SecondplayerRow][SecondplayerColumn] == 'X'||board2 [SecondplayerRow][SecondplayerColumn] == 'O')
				{//begins if statement for error of space occupied
					System.out.print("Error: You have choosen a spot already occupied choose another space\n");
				k=10;
					
				}//end if statement for space occupied error
				
				else if( board2 [SecondplayerRow][SecondplayerColumn] == ' ')
					
				{//else if statement begins if space available for second player
					board2 [SecondplayerRow][SecondplayerColumn]=SecondPlayersChoosenCharacter;
				//prints board with second player choice
				System.out.print( "\n        "+ "| " +board2[0][0] + " | " + board2[0][1] + " | " + board2[0][2] + " |\n" + 
						"        --------------\n"+
						"        | "+board2[1][0] + " | " + board2[1][1] + " | " + board2[1][2] + " |  \n" +
						"        --------------\n"+
						"        | " +board2[2][0] + " | " + board2[2][1] + " | " + board2[2][2] +" |\n\n");
						k=11;
					if( board2[0][0] =='O' && board2[0][1]=='O'&&board2[0][2] =='O'||board2[1][0] =='O' && board2[1][1]=='O'&&board2[1][2]=='O'
						||board2[2][0] =='O' && board2[2][1]=='O' &&board2[2][2]=='O'||board2[0][0]=='O'&&board2[1][0]=='O'&&board2[2][0]=='O'||
						board2[0][1]=='O'&& board2[1][1]=='O'&&board2[2][1]=='O'||board2[0][2] =='O' && board2[1][2]=='O'&&board2[2][2]=='O'||
						board2[0][0]=='O' && board2[1][1]=='O'&&board2[2][2]=='O'||board2[0][2]=='O' &&board2[1][1]=='O'&&board2[2][0]=='O'
						)
					{//nested if statement to see if second player won
					System.out.print( "O player won");
					i =11;
					System.exit(0);
						}//end if statement to check for the win
						
						if (board2[0][0]!=' ' && board2[0][1]!=' '&& board2[0][2]!=' '
								&& board2[1][0]!=' '&& board2[1][1]!=' '&& board2[1][2]!=' '&& 
								board2[2][0]!=' '&& board2[2][1]!=' '&& board2[2][2]!=' ')
						{//nested if statement to see if there is a tie
							System.out.print( "It's a tie");
									i = 12;
						
									System.exit(0);
									}//end of nested if statement if there's a tie	
				}//else if statement ends if second player space available
				}//end to second player loop
				}//end to while loop 			
	}//main method ends
	}//ends class
