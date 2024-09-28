import java.util.Scanner;
public class Games
 {
    public static void main(String[] args) 
    {
         while(true){
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice : ROCK , PAPER & SCISSOR . ");
        String myMove =sc.nextLine().toUpperCase();
        System.out.println("myMove = "+ myMove);

     
        if(!myMove.equals("ROCK") && !myMove.equals("PAPER") && !myMove.equals("SCISSOR"))
        {
            System.out.println("your move is not valid.\n \\choose ROCK , PAPER or SCISSOR ");
        }
        else
        {

            int random = (int)(Math.random()*3);
            String opponentMove = "";
            
            if(random==0)
            {
                opponentMove = "ROCK";
            }else if(random==1)
            {
                opponentMove="PAPER";
               
            }
            else
            {
                opponentMove="SCISSOR";
               
            }
           System.out.println("Opponent Move =" + opponentMove );

            if(myMove.equals(opponentMove))
            {
                System.out.println("you tied");
            }
            else 
            if(myMove.equals("ROCK") && opponentMove.equals("SCISSOR" )|| 
            myMove.equals("SCISSOR") && opponentMove.equals("PAPER") || 
            myMove.equals("PAPER") && opponentMove.equals("ROCK"))
            {
              System.out.println("you win");
            }
            else
            {
                System.out.println("you lost");
            }
        }   
      }
    }
  }