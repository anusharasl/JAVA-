import java.util.Scanner;
public class efg{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the table:");
        int n = sc.nextInt();
        for(int i=1;i<=10;i=i+1)
        {
            System.out.println(i+"*"+n+"="+i*n);
        }
    }
}