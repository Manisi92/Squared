import java.util.Scanner;
public class Squared {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int num;

        System.out.println("Insert a number:");
        num = scan.nextInt();

        int product = num * num;

        System.out.println(product);
    }
}
