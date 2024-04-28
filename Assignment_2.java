import java.util.Scanner;

public class Assignment_2
{
    public static void calculateGrade(int percentage)
    {
        if(percentage > 80)
        {
            System.out.println("GRADE O");
        }else if(percentage > 70)
        {
            System.out.println("GRADE A");
        }else if(percentage > 60)
        {
            System.out.println("GRADE B");
        }else if(percentage > 50)
        {
            System.out.println("GRADE C");
        }else if(percentage > 40)
        {
            System.out.println("GRADE D");
        }else if(percentage == 40)
        {
            System.out.println("GRADE P");
        }else{
            System.out.println("GRADE F");
        }
    }

    public static boolean isValid(int n)
    {
        return n != 0;
    }

    public static void main(String[] args)
    {

        System.out.println("\n---------- STUDENT GRADE CALCULATOR ----------\n");

        int[] marks;
        int totalMarks = 0;
        int percentage = 0;
        int n = 0;

        while(true)
        {
            Scanner input = new Scanner(System.in);

            System.out.println("\n1. Enter Marks");
            System.out.println("2. Total Marks");
            System.out.println("3. Average Marks");
            System.out.println("4. Average Grade");
            System.out.println("0. Exit");
            System.out.print("\nEnter Your Input Here --> ");
            int choice = input.nextInt();

            System.out.println();
            switch (choice)
            {
                case 1 :
                    System.out.print("Enter the total Number Of Subjects : ");
                    n = input.nextInt();

                    marks = new int[n];

                    System.out.println();
                    for(int i = 0; i < marks.length; i++)
                    {
                        System.out.print("Enter the Marks of Subject "+ (i + 1) +" out of 100 : ");
                        marks[i] = input.nextInt();
                        totalMarks += marks[i];
                    }
                    break;
                case 2 :
                    if(isValid(n))
                    {
                        System.out.println("Total Marks : "+ totalMarks);
                    }
                    else{
                        System.out.println("Firstly, Enter Marks");
                    }
                    break;
                case 3 :
                    if(isValid(n))
                    {
                        percentage = totalMarks / n;
                        System.out.println("Percentage  : "+ percentage);
                    }else{
                        System.out.println("Firstly, Enter Marks");
                    }
                    break;
                case 4 :
                    if(isValid(n))
                    {
                        calculateGrade(percentage);
                    }
                    else {
                        System.out.println("Firstly, Enter Marks");
                    }
                    break;
                case 0:
                    System.out.println("\nEXIT !!!");
                    return;
                default :
                    System.out.println("\nInvalid Input !!!");
            }
        }
    }
}