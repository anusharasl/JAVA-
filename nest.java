import java.util.Scanner;
public class nest{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter score");
        int score = sc.nextInt();
        if(score<50)
        {
            System.out.print("you need to improve");
        }
        else if(score>=50 && score<=70)
        {
            System.out.print("good job");
        }
        else if(score>70)
        {
            System.out.print("Excellent performance");
        }
    }
}