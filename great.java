import java.util.Scanner;
public class great{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no1:");
        int no1 = sc.nextInt();
        System.out.print("enter no2:");
        int no2 = sc.nextInt();
        
        String result = (no1>no2)?"a is greater":(no2>no1)?"b is greater":"both are equal";
        System.out.print(result);
    }
}