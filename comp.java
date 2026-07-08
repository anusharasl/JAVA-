import java.util.Scanner;
public class comp {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String rcb = sc.nextLine();
        if(rcb.equals("win"))
        {
            System.out.print("cup is ours");
        }
        else
        {
            System.out.print("we loose");
        }
    }
}

