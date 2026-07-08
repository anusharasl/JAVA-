import java.util.Scanner;
class hello{
    public static void main (String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a:");
        int a = sc.nextInt();
        System.out.print("enter b:");
        int b = sc.nextInt();
        System.out.print("enter c:");
        int c = sc.nextInt();
        int d=a*b*c;
        int e=a+b+c;
        System.out.println(d);
        System.out.println(e);
        System.out.println(d%e);
    }
}