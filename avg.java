import java.util.Scanner;
public class avg{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();
        int sub4 = sc.nextInt();
        int sub5 = sc.nextInt();
        int sum = sub1+sub2+sub3+sub4+sub5 ;
        int avg = sum/5;
        if(avg>35)
        {
            System.out.print("free to go");
        }
        else{
            System.out.print("stay for additional class");
        }
    }
}