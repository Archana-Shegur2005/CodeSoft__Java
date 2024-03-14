import java.util.*;
class number_game {
 
    public static void guessnumber()
    {
        Scanner sc = new Scanner(System.in);
        int number = 1 + (int)(100* Math.random());
        int trial = 10;
        int i, guess;
        System.out.println("\n-------------------------------------------------------------------");
        System.out.println("------------------        Number Guessing Game      ----------------");
        System.out.println("--------------------------------------------------------------------\n\n");
        System.out.println("**************");
        System.out.println( "   Rules   ");
        System.out.println( "*************\n");
        System.out.println( " 1. Choose the Number between 1 to 100. ");
        System.out.println( " 2. You have only 10 trial to guess the number !!! \n\n");
        int j=10;
        for (i = 0; i < trial; i++) 
        {
            System.out.println("\n  -------------------");
             System.out.print("  Guess the number! : ");
             guess = sc.nextInt();
             System.out.println("  -------------------");
            j=j-1;
            if (number == guess) 
            {
                System.out.println("\n  Congratulations!!! You guessed the correct number that is "+number);
                System.out.println("  let's Play Again !!!");
                break;
            }

            else if (number > guess && i != trial - 1) {
                
                System.out.println("\n  The number is greater than " + guess);
                System.out.println("\n  Try again,  You have a "+j+" chance !!!\n");

            }

            else if (number < guess && i != trial - 1) {

                System.out.println("\n  The number is less than " + guess);
                System.out.println("\n  Try again,  You have a "+j+" chance !!\n");

            }
        }
 
        if (i == trial) {

            System.out.println( "\n  You have exhausted 10 trials.");
            System.out.println("\n  The number was " + number);
            System.out.println("\n  Let's play again !!!\n\n");

        }

    }
 
    public static void main(String arg[])
    {
        guessnumber();

    }
}