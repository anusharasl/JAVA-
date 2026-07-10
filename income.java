import java.util.Scanner;
public class income{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("income:");
        int income=sc.nextInt();
        if(income>=70000)
        {
            System.out.print("scholarship is available");
        }
        else
        {
            System.out.print("not eligible for scholarship ");
        }
    }
}