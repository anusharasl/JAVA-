import java.util.Scanner;
public class dum{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = sc.nextInt();
        System.out.print("Enter b:");
        int b = sc.nextInt();
        int count = 0;
        for(int i=a;i<=b;i=i+1)
        {
         if(i%2==0)
         {
           //System.out.print(i);
         }
         else{
            count=count+1;
            System.out.println(i);
         }
        }
        System.out.println(count);  
    
    }
}