
package WordCounter;
import java.util.Scanner;

public class WordCounter
{
   public static Scanner s = new Scanner (System.in); 
   public static String word;
   public static int letter =0,space=0,digit=0,other=0;
   public char ch[]=word.toCharArray(); 
   public static  int totalWords, character;
   
   public static void main(String[] args)
           
   {
      mainfuction();
   }
   
   public static void mainfuction(){
      
      System.out.print("\n================================================\n");
       
      System.out.println("\n          Welcome to Word Counter");
       
      System.out.print("\n================================================");
      
      System.out.print("\nEnter the Name of user: ");
      word = s.nextLine();

      System.out.print("Enter the Words that you need to count: ");
      word = s.nextLine();
      
      System.out.print("================================================");
     
      Character();
      Letter();               
      returns();

   }

     public static void Character(){
       
      String words[] = word.split(" ");
      totalWords = words.length; 
      System.out.println("\nNumber of Words = " +totalWords);
   
   }
   
   public static void Letter() {
     char ch[]=word.toCharArray();
    
        for(int a=0;a<word.length();a++)
  {
    
     if(Character.isLetter(ch[a]))
     {
         letter++;
     }
             
     else if(Character.isDigit(ch[a]))
     {
        digit++;
     }
     else if(!Character.isSpaceChar(ch[a]))
     {
         other++;
     }
       else{
         space++;
     }
  }    
    int counts = 0;    

    //Counts each character except space    
    for(int a = 0; a < word.length(); a++) {    
        if(word.charAt(a) != ' ')    
            counts++;    
    }    
   character = counts;
 
  System.out.println("Letters  = "+ letter  
                     + "\nSpaces  = "+ space 
                     + "\nDigits  = " + digit 
                     + "\nOthers = " + other 
                     +"\n================================================"
                     + "\nThe total numbers of input character is: " + character); 
               
  }
     
  public static void returns(){
       
        
        System.out.println("=================================================\n");
        System.out.println("Do you want to try again?: [1] YES or [2] NO ");
        System.out.println("\nYour selection: ");
        String choices = s.nextLine();
        ask_again(choices);
      
    }
  
 public static void ask_again(String answer){

     System.out.println(answer);
       switch (answer) {
           case "1":
               mainfuction();
               break;
           case "2":
               System.out.println("Bye!");
               return;
           default:
               System.out.println("Incorrect!!");
               System.out.println("Please Try Again!!");
               returns();
               break;
       }
 }
}
