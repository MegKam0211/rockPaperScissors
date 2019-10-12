import javax.lang.model.util.ElementScanner6;
import javax.swing.*;
import java.util.Scanner;
import java.util.Random;

public class rockPaperScissors_corrected
{
    
    public static void main(String[] args)
    {   
        //create constant variables RPS
        int R = 0; //R = Rock
        int P = 1; //P = Paper
        int S = 2; //S = Scissors

        //changing variables
        int u; //users guess
        int c; //computer's choice

        Scanner myScan = new Scanner(System.in);
        Random myRand = new Random();
        System.out.print("Choose of the following, 0 for Rock, 1 for Paper or 2 for Scissors?:  ");
        u = myScan.nextInt(); // goes to keyboard and gets the next integer thats typed in
        c = myRand.nextInt(); //computer's guess from the Random method and gets the next integer
        
        //check for a tie
        if(u == c)
        {
            System.out.println("It's a draw."); //print tie
        }
        //3 conditions where the user would win
        else if((u == R && c == S) || (u == S && c == P) || (u == P && c == R))
        {
            System.out.println("You win!");//print user wins
        }
        else //because user did not win, checks not placed here and it can be assumed that the user did not win because the above conditions were not met
        {
            System.out.println("You lose.");//print pc wins
        }

    }   




}        