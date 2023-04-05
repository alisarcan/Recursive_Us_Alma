import java.util.Scanner;
public class Main {
    static int power(int base, int exp){


        if(exp == 0)
            return 1;
        else {
            return base * power(base, exp-1);
        }


    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int base = scan.nextInt();
        int exp = scan.nextInt();

        int result = power(base,exp);
        System.out.println(result);

    }
}
