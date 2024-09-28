import java.util.Scanner;
class P1 extends Exception
{
    public void fun()
    {
        System.out.println("It does not contains vowel");
    }
}
public class user 
{
    public static void main(String[] args) {
        
    
    String s;
    Scanner sc=new Scanner(System.in);
        try{
        System.out.println("ENter the string");
        s=sc.next();
        if(s.toLowerCase().contains("a")||s.toLowerCase().contains("e")||s.toLowerCase().contains("i")||s.toLowerCase().contains("o")||s.toLowerCase().contains("u"))
        {
            System.out.println("It contains vowel");
        }
        else{
            throw new P1();
        }
    }
    catch(P1 e)
    {
        e.fun();
    }
    catch(Exception e)
    {
     System.out.println(e);

    }


}
}