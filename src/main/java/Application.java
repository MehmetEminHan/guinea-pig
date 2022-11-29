import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int second = scan.nextInt();
        int minute = second / 60;
        int minuteMod = (second % 60) ;
        System.out.println(+minute +"."+minuteMod);


    }
}
