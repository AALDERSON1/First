//3.10 Hi-Lo guessing game

import java.util.Scanner;

public class HiLo
{
   public static void main (String[] args)
   {
      int target, again, guess;
      int count = 0;
      Scanner scan = new Scanner(System.in);

      do
      {
         System.out.println();
         System.out.println ("Guess a number between 1-100");

         target = (int) (Math.random() * 100) + 1;

         do
         {
            System.out.println();
            System.out.print ("Enter your guess (0 to quit): ");
            guess = scan.nextInt();
            count = count + 1;

            if (guess > 0)
               if (guess == target)
                  System.out.println ("You got it! You guessed " + count + " times.");
               else
                  if (guess < target)
                     System.out.println ("Your guess was too low.");
                  else
                     System.out.println ("Your guess was too high.");
         }
         while (guess != target && guess > 0);

         System.out.println();
         System.out.println ("Press \"0\" to continue playing and \"1\" to stop playing.");
         again = scan.nextInt();
      }
      while (again == 0);
   }
}
