import java.util.Scanner;
public class print{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = sc.nextInt();
        System.out.print("Enter b:");
        int b = sc.nextInt();
        for(int i=a;i<=b;i=i+1)
        {
         if(i%2==0)
         {
            //System.out.println(i);
         }
         else{
            System.out.println("odd no:"+i);
         }  
        }
    }
}