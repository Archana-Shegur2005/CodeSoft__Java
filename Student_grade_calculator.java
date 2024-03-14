import java.util.*;
public class Student_grade_calculator{
    public static void main(String args[])
    {
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("----------------------   Student Grade Calculator    --------------------------");
        System.out.println("-------------------------------------------------------------------------------\n\n");
        System.out.print("Enter Total Subject : ");
        Scanner sc=new Scanner(System.in);
        int total=sc.nextInt();
        int sub[]=new int[total];
        int mark,i=1;
        int sum=0;
        double avg;
        for(i=0;i<total;i++)
        {
            System.out.print("Enter marks of Subject "+(i+1)+" out 100 : ");
            mark=sc.nextInt();
            sub[i]=mark;
            sum+=mark;
        }
        System.out.println("\n\n");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("--------------------Your Entered Subjects and Marks ---------------------------");
        System.out.println("-------------------------------------------------------------------------------");
        for(i=0;i<total;i++)
        {
            System.out.println("Subject "+(i+1)+" marks = "+sub[i]+"/100");
        }
        System.out.println("\n\n-------------------------------------------------------------------------------");
        System.out.println("Total Marks obtained in "+total+" subjects are = "+sum+"/"+(total*100));
        System.out.println("-------------------------------------------------------------------------------");

        avg=(double)(sum/total);
        System.out.println("\n\n-------------------------------------------------------------------------------");
        System.out.println("Total Percentage obtained in "+total+" subjects are = "+avg+"%");
        System.out.println("-------------------------------------------------------------------------------");

        String grade;
        if(avg>=90 && avg<=100)
        {
            grade="A+";
        }
        else if(avg>=80 && avg<=89)
        {
            grade="A";
        }
        else if(avg>=70 && avg<=79)
        {
            grade="B+";
        }
        else if(avg>=60 && avg<=69)
        {
            grade="B";
        }
        else if(avg>=50 && avg<=59)
        {
            grade="C+";
        }
        else if(avg>=35 && avg<=49)
        {
            grade="C";
        }
        else 
        {
            grade="Fail";
        }

        System.out.println("\n\n---------------------------------------------------------------------------");
        System.out.println("-----------------    Student Grade information   --------------------------");
        System.out.println("---------------------------------------------------------------------------\n\n");
        System.out.println("Your Total Marks ="+sum+"/"+(total*100));
        System.out.println("Your Percentage = "+avg+"%");
        System.out.println("Your Grade = :"+grade+"\n\n");



    }
}