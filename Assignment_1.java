import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class Assignment_1
{
    static List<Integer> scores = new ArrayList();

    public static void viewScores()
    {
        if(scores.isEmpty())
        {
            System.out.println("SCORES NOT AVAILABLE");
            return;
        }

        for(int i = 0; i < scores.size(); i++)
        {
            System.out.println("Score of Game "+ (i + 1) +" is : "+ scores.get(i));
        }
        System.out.println();
    }

    public static void startGame()
    {
        Scanner input = new Scanner(System.in);
        int random = 0;
        int attempt = 1;
        int count = 0;

        Random rand = new Random();

        System.out.print("Enter the Number of Rounds : ");
        int round = input.nextInt();

        for(int i = 0; i < round; i++)
        {
            attempt = 1;
            random = rand.nextInt(1, 5);

            System.out.println("\n---------- ROUND "+ (i + 1) +" ----------");
            System.out.println("\t\t    MAX ATTEMPT - 3");

            while(true)
            {
                if (attempt > 3)
                {
                    System.out.println("No More Attempts, You Loose Round " + (i + 1) + "!");
                    break;
                }

                System.out.print("\n(Attempt " + attempt + ") Enter a Number Between 1 to 5 : ");
                int num = input.nextInt();

                if (random == num)
                {
                    System.out.println("You Guessed The Correct Number !!!");
                    count += 1;
                    break;
                } else if (random > num)
                {
                    System.out.println("Too Low !");
                }
                else if (random < num)
                {
                    System.out.println("Too High !");
                }

                attempt += 1;
            }
        }
        scores.add(count);
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("\n---------- RANDOM NUMBER GAME ----------");

        while(true)
        {
            System.out.println("\n1. Start Game");
            System.out.println("2. View Scores");
            System.out.println("3. Quit Game");
            System.out.print("\nEnter Your Input Here --> ");
            int choice = input.nextInt();

            System.out.println();
            switch (choice)
            {
                case 1 :
                    startGame();
                    break;
                case 2 :
                    viewScores();
                    break;
                case 3 :
                    System.out.println("THANK YOU FOR PLAYING !!!");
                    return;
                default :
                    System.out.println("\n\nInvalid Input !!!");
            }
        }
    }
}