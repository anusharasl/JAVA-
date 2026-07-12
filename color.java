import java.util.Scanner;
public class color{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String color = sc.nextLine();
        if(color.equals("red"))
        {
            System.out.print("stop");
        }
        else if(color.equals("yellow"))
        {
            System.out.print("get ready");
        }
        else if(color.equals("green"))
        {
            System.out.print("go");
        }
    }
}