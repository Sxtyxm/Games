import java.util.Scanner;
public class game
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


      /*   //Calculator
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter 1 no. :");
     float a=sc.nextFloat();
     System.out.println("Enter 2 no. :");
     float b=sc.nextFloat();

     System.out.println("Enter the operator : * , / , + , - , %  : ");
     char operator=sc.next().charAt(0);
     System.out.println("you choose " + operator +  "operator" );

     switch(operator){
        case '+' : 
          System.out.println(a + b);
          break; 
        case '-' : 
          System.out.println(a - b);
           break; 
        case '/' : 
          System.out.println(a / b);  
           break; 
        case '*' : 
          System.out.println(a * b);  
           break; 
        case '%' : 
          System.out.println(a % b);  
        default :
        System.out.println("you operator is invalid");   */


        // Java program to illustrate while loop


		/*int x = 1, sum = 0;
		while (x <= 10) {
			sum = sum + x;
			x++;
		}
		System.out.println("Summation: " + sum);*/
	
/*int i = 1;
while(i<=10){
  System.out.println(i);
  i++;
}*/


/*int i =1 ;
int sum=0;
while(i<=5){
  System.out.println(sum=sum+i);
  i++;
}

int p =1 ;
int s=0;
while(p<=10){
  s=s+p;
  p++;
}
System.out.println(s);*/
/* 
while(false){
  String s= "satyam bhai";
  System.out.println(!s);
}
*/


   // int a = 13;
    //do{
    //System.out.println("hey");
    //  a++;
    //}
    //while(a<3);

//for(int i=0;i<=10;i++)
//{
  //System.out.print("  " + i);
//}

/*
//int n=5;
//for(int i=1;i<=n;i++){
  //System.out.println(2*i);
//}

for(int i=0;i<=10;i+=2){
  System.out.println(i);
}
*/




























     }    
    }
    

