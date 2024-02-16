import java.util.Scanner;
public class factor {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter n");
        n = scan.nextInt();
        int count, i;
        count = 0;
        i = 1;
        while ( i <= n ) {
            if (n % i == 0) {
                count++;
            }
            i++;
        }
        if (count == 2) {
            System.out.println("It is prime");
        } else {
            System.out.println("It is not prime");
        }
    }
} 