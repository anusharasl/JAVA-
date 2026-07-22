import java.util.Random;

public class rand {
    public static void main(String[] args) {

        Random random = new Random();
        int newnum = 0;

        while (newnum != 5) {
            newnum = random.nextInt(11);
            System.out.println(newnum);
        }
    }
}