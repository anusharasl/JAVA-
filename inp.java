import java.util.Scanner;
class inp{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int count =0;
        do{
            System.out.print("Enter the number > 10:");
            count = sc.nextInt();
        }
        while(count<10);
    }
}