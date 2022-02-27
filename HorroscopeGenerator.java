import java.util.Scanner;
import java.util.Random;

public class HorroscopeGenerator
{

   public static void main (String[] args)
   {
      Scanner in = new Scanner (System.in);
      Random r = new Random();
      
      //birth values
      int birthMonth = 0;
      int birthDay = 0;
      
      //horocope value
      int scope = 0;
      
      //do again value
      String doAgain = "";
      
      //Zodiac Signs
      String youAre = "You are a ";
      String aries = youAre + "Aries";
      String taurus = youAre + "Taurus";
      String gemini = youAre + "Gemini";
      String cancer = youAre + "Cancer";
      String leo = youAre + "Leo";
      String virgo = youAre + "Virgo";  //test virgo again
      String libra = youAre + "Libra.";
      String scorp = youAre + "Scorpio.";
      String sagit = youAre + "Sagittarius";
      String capri = youAre + "Capricorn";
      String aquar = youAre + "Aquarius";
      String pisces = youAre +"Pisces";
      
      do //put program in a loop until user quits.
      {
         //enter birth month & create an invalid input if it goes past 13
         System.out.print("Enter your Birth month(1-12): ");
         birthMonth = in.nextInt();
         
         //if the month input is greater than 12
         while(birthMonth > 12 || birthMonth < 1)
         {
            System.out.println("Invalid selection, please try again.");
            System.out.print("Enter your Birth month(1-12): ");
            birthMonth = in.nextInt();
         }        
         
         //enter birth day & create an invalid input if goes pastt 30 or 31 days
         System.out.print("Enter your Birth day: ");
         birthDay = in.nextInt();
             
         /* check if February has more than 29 days, 
         or April, June, September, or November has more than 30 days.
         or less than 1 day*/
         while ((birthMonth == 2 && birthDay >=30) || 
         ((birthMonth == 4 || birthMonth == 6 || birthMonth == 9 || 
         birthMonth == 11) && birthDay >= 31) || birthDay < 1)
         {
            System.out.println("Invalid selection, please try again.");
            System.out.print("Enter your Birth day: ");
            birthDay = in.nextInt();
         }
         
         //chesk for rest of the months if more than 31 or less than 1 was inputted 
         while (birthDay > 31 || birthDay < 1)
         {
            System.out.println("Invalid selection, please try again.");
            System.out.print("Enter your Birth day: ");
            birthDay = in.nextInt();
         }
         
         //space 
         System.out.println();
         
         //Aries
         if ((birthMonth == 3 && (birthDay >= 21 && birthDay <= 31)) 
            || (birthMonth == 4 && (birthDay >= 1 && birthDay <= 19)))
         {
         System.out.println(aries);
         }
         
         //Taurus
         if ((birthMonth == 4 && (birthDay >= 20 && birthDay <= 30)) 
            || (birthMonth == 5 && (birthDay >= 1 && birthDay <= 20)))
         {
         System.out.println(taurus);
         }
         
         //Gemini
         if ((birthMonth == 5 && (birthDay >= 21 && birthDay <=31)) 
            || (birthMonth == 6 && (birthDay >= 1 && birthDay <= 21)))
         {
         System.out.println(gemini);
         }
         
         //Cancer
         if ((birthMonth == 6 && (birthDay >= 22 && birthDay <=30)) 
            || (birthMonth == 7 && (birthDay >= 1 && birthDay <= 21)))
         {
         System.out.println(cancer);
         }
         
         //Leo
         if ((birthMonth == 7 && (birthDay >= 22 && birthDay <=31)) 
            || (birthMonth == 8 && (birthDay >= 1 && birthDay <= 22)))
         {
         System.out.println(leo);
         }
         
         //Virgo
         if ((birthMonth == 8 && (birthDay >= 22 && birthDay <=31)) 
            || (birthMonth == 9 && (birthDay >= 1 && birthDay <= 22)))
         {
         System.out.println(virgo);
         }
         
         //Libra
         if ((birthMonth == 9 && (birthDay >= 23 && birthDay <=30)) 
            || (birthMonth == 10 && (birthDay >= 1 && birthDay <=22)))
         {
         System.out.println(libra);
         }
         
         //Scorpio
         if ((birthMonth == 10 && (birthDay >= 23 && birthDay <=31)) 
            || (birthMonth == 11 && (birthDay >= 1 && birthDay <=22)))
         {
         System.out.println(scorp);
         }
         
         //Sagittarius
         if ((birthMonth == 11 && (birthDay >= 23 && birthDay <=30)) 
            || (birthMonth == 12 && (birthDay >= 1 && birthDay <=21)))
         {
         System.out.println(sagit);
         }
         
         //Capricorn
         if ((birthMonth == 12 && (birthDay >= 22 && birthDay <=31)) 
            || (birthMonth == 1 && (birthDay >= 1 && birthDay <=19)))
         {
         System.out.println(capri);
         }
         
         //Aquarius
         if ((birthMonth == 1 && (birthDay >= 20 && birthDay <=31)) 
            || (birthMonth == 2 && (birthDay >= 1 && birthDay <=18)))
         {
         System.out.println(aquar);
         }
         
         //Pisces
         if ((birthMonth == 2 && (birthDay >= 19 && birthDay <=29)) 
            || (birthMonth == 3 && (birthDay >= 1 && birthDay <= 20)))
         {
         System.out.println(pisces);
         }
         
         scope = r.nextInt (6)+1;
         
         if (scope == 1)
         {
            System.out.println("If you think you're spending too much time slacking, then study it out and do the ");  
            System.out.println("right thing. Bear in mind that nobody can hold you down but yourself.");
         }
         else if (scope == 2)
         {
            System.out.println("Are you wondering about talking to your significant other? This week is ");
            System.out.println("ultimately a turning point in your life and you'll know what to do. You feel "); 
            System.out.println("emotionally centered and ready for almost anything.");         
         }
         else if (scope == 3)
         {
            System.out.println("Your next Career: Taxidermist. Buy a box of fake eyeballs. You'll thanks us later. ");
         }
         else if (scope == 4)
         {
            System.out.println("After months of backbreaking effort, you'll finally finish your first novel. Now, ");
            System.out.println("imagine how difficult it would be to actually write one.");
         }
         else if (scope == 5)
         {
            System.out.println("Just when you finally have all the answers, someone has changed all the ");
            System.out.println("questions.");
         }
         else if (scope == 6)
         {
            System.out.println("Are you wondering about taking a big step in a new direction? The coming ");
            System.out.println("week might be the day you became YOU and you'll have to make a decision. ");
         }   
         
         //Flush the buffer
         in.nextLine();
         
         //space 
         System.out.println();
         
         //Do again question
         System.out.print("Would you like to do this again? y/n: ");
         doAgain = in.nextLine();
         
         while(!(doAgain.equalsIgnoreCase("y") || doAgain.equalsIgnoreCase("n")))
         {
            System.out.println("Invalid selection, please try again.");
            System.out.print("Would you like to do this again? y/n: ");
            doAgain = in.nextLine();
         }     

      }while (!(doAgain.equalsIgnoreCase("n")));//end do while loop

    }//end main

}//end class